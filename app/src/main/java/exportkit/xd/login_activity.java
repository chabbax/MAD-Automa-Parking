
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ImageView;

public class login_activity extends Activity {

	// Create button object
	private View _bg__login_ek2;
	private View circle6;
	private View circle5;
	private TextView _5_30_pm_ek7;
	private ImageView battery3;
	private ImageView signal3;
	private TextView login_ek3;
	private ImageView wifi3;
	private View login_background_grey;
	private TextView welcome_back_;
	private TextView begin_automa_parking;
	private TextView forgot_your_password_;
	private TextView do_you_already_have_an_account__sign_up;
	private View login_button;
	private View login_email_txt_feild;
	private View login_password_txt_feild;
	private TextView login_ek4;
	private TextView enter_your_email;
	private TextView enter_password;
	private ImageView login_img;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.login);

		// Link java button with xml button
		login_button = findViewById(R.id.login_button);

		// Set listener to the button
		login_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),selection_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});
	
	}
}
	
	