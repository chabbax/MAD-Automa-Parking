package exportkit.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class update extends AppCompatActivity {

    // Creating objects
    private EditText title, desc;
    private View edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        title = findViewById(R.id.edit_type_name);
        desc = findViewById(R.id.edit_type_cardno);
        edit = findViewById(R.id.edit_total_amount);
    }
}