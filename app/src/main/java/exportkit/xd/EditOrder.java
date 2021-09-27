package exportkit.xd;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditOrder extends AppCompatActivity {

    // Creating objects
    private EditText title,des;
    private Button edit;
    private DbHandler dbHandler;
    private Context context;
    private Long updateDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_to_do);

        context = this;
        dbHandler = new DbHandler(context);

        // Link java button with xml button
        title = findViewById(R.id.editToDoTextTitle);
        des = findViewById(R.id.editToDoTextDescription);
        edit = findViewById(R.id.buttonEdit);

        // Get ID of order
        final String id = getIntent().getStringExtra("id");
        Order todo = dbHandler.getSingleToDo(Integer.parseInt(id));

        title.setText(todo.getTitle());
        des.setText(todo.getDescription());

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titleText = title.getText().toString();
                String decText = des.getText().toString();
                updateDate = System.currentTimeMillis();

                // Data sent to the database handler to be updated
                Order toDo = new Order(Integer.parseInt(id),titleText,decText,updateDate,0);
                int state = dbHandler.updateSingleToDo(toDo);
                System.out.println(state);

                // Redirected
                Toast.makeText(getApplicationContext(),
                        "Updated",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, Records.class));
            }
        });
    }
}
