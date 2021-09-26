package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Records extends AppCompatActivity {

    // Creating objects
    private Button add;
    private ListView listView;
    private TextView count;
    Context context;
    private DbHandler dbHandler;
    private List<Order> toDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        dbHandler = new DbHandler(context);

        // Link java button with xml button
        add = findViewById(R.id.add);
        listView = findViewById(R.id.todolist);
        count = findViewById(R.id.todocount);
        toDos = new ArrayList<>();

        toDos = dbHandler.getAllToDos();

        OrderAdapter adapter = new OrderAdapter(context,R.layout.single_todo,toDos);
        listView.setAdapter(adapter);

        //get order counts from the table
        int countTodo = dbHandler.countToDo();
        count.setText("You have "+countTodo+" orders. Keep purchasing :)");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, AddOrder.class));
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Alert message features
                final Order todo = toDos.get(position);
                AlertDialog.Builder builder = new AlertDialog.Builder(context);

                builder.setTitle(todo.getTitle());
                builder.setMessage(todo.getDescription());
                builder.setPositiveButton("Satisfied", new DialogInterface.OnClickListener() {

                    // Rating functionality
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        todo.setFinished(System.currentTimeMillis());
                        dbHandler.updateSingleToDo(todo);
                        startActivity(new Intent(context, Records.class));
                    }
                });
                builder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {

                    // Delete Functionality
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dbHandler.deleteToDo(todo.getId());
                        startActivity(new Intent(context, Records.class));
                    }
                });
                builder.setNeutralButton("Update", new DialogInterface.OnClickListener() {

                    // Update functionality
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(context, EditOrder.class);
                        intent.putExtra("id",String.valueOf(todo.getId()));
                        startActivity(intent);
                    }
                });
                builder.show();
            }
        });

    }
}
