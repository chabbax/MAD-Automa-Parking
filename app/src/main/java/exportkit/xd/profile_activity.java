
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ImageView;

public class profile_activity extends Activity {

	// Create button object
	private View _bg__profile_ek2;
	private View circle8;
	private View circle7;
	private TextView _5_30_pm_ek6;
	private ImageView battery4;
	private ImageView signal4;
	private TextView my_profile;
	private ImageView wifi4;
	private View profile_background_grey;
	private TextView account_details;
	private TextView your_information_is_safe_with_us;
	private View profile_name_txt_feild;
	private View profile_email_txt_feild;
	private View profile_password_txt_feild;
	private View profile_phone_txt_feild;
	private View edit_btn;
	private View save_btn;
	private View delete_btn;
	private TextView delete_account;
	private TextView edit_account;
	private TextView save;
	private TextView full_name__;
	private TextView my_email__;
	private TextView password__;
	private TextView phone_number__;
	private TextView _0766973598;
	private TextView xxxxxxxxxxxxx;
	private TextView timmy_gmail_com;
	private TextView tom_perera;
	private ImageView profile_pic;
	private ImageView profile_img_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.profile);

		// Link java button with xml button
		save_btn = findViewById(R.id.save_btn);

		// Set listener to the button
		save_btn.setOnClickListener(new View.OnClickListener() {
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
	
	