package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddOrder extends AppCompatActivity {

    // Create button object
    private EditText title, desc;
    private Button add;
    private DbHandler dbHandler;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        // Link java button with xml button
        title = findViewById(R.id.editTextTitle);
        desc = findViewById(R.id.editTextDescription);
        add = findViewById(R.id.buttonAdd);
        context = this;

        dbHandler = new DbHandler(context);

        // Set listener to the button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userTitle = title.getText().toString();
                String userDesc = desc.getText().toString();
                long started = System.currentTimeMillis();

                // Passing data into function to be stored in the database
                Order toDo = new Order(userTitle,userDesc,started,0);
                dbHandler.addToDo(toDo);

                // Redirect
                startActivity(new Intent(context, Records.class));
            }
        });
    }
}
