
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ImageView;

public class selection_activity extends Activity {

	// Create button object
	private View selection_send_mail;
	private View order_coffee_btn;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.selection);

		// Link java button with xml button
		order_coffee_btn = findViewById(R.id.order_coffee_btn);

		// Set listener to the button
		order_coffee_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),start_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		// Link java button with xml button
		selection_send_mail = findViewById(R.id.selection_send_mail);

		// Set listener to the button
		selection_send_mail.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),contact_us_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

	}
}
	
	