
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ImageView;

public class sign_up_activity extends Activity {

	// Create button object
	private View signup_btn;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.sign_up);

		// Link java button with xml button
		signup_btn = findViewById(R.id.signup_btn);

		// Set listener to the button
		signup_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),login_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});


	
	}
}
	
	