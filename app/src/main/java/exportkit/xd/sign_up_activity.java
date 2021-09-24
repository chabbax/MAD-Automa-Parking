
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class sign_up_activity extends Activity {

	// Create button object
	private View _bg__sign_up_ek2;
	private View circle4;
	private View circle3;
	private TextView _5_30_pm_ek8;
	private ImageView battery2;
	private ImageView signal2;
	private TextView sign_up_ek3;
	private ImageView wifi2;
	private View background_grey;
	private TextView register_with_us_;
	private TextView your_information_is_safe_with_us_ek1;
	private TextView do_you_already_have_an_account__login;
	private View signup_btn;
	private View signin_name_txt_feild;
	private View signin_email_txt_feild;
	private View signin_password_txt_feild;
	private View signin_confirm_password_txt_feild;
	private TextView sign_up_ek4;
	private TextView enter_your_email_ek1;
	private TextView enter_full_name;
	private TextView enter_password_ek1;
	private TextView confirm_password;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
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
	
	