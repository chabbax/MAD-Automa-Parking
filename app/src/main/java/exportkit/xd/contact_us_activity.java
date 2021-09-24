
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class contact_us_activity extends Activity {

	// Create button object
	private View back_btn;
	private View _bg__contact_us_ek2;
	private View circle10;
	private View circle9;
	private TextView _5_30_pm_ek5;
	private ImageView battery5;
	private ImageView signal5;
	private TextView automa_parking_ek1;
	private ImageView wifi5;
	private View send_btn;
	private TextView send_mail;
	private View contact_background;
	private ImageView profile_img;
	private TextView contact_us_ek3;
	private TextView contact_us_via_your_email_to_our_customer_support;
	private View contact_message_txt_feild;
	private View contact_name_txt_feild;
	private View contact_email_txt_feild;
	private TextView full_name_ek1;
	private TextView email;
	private TextView message;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_us);

		// Link java button with xml button
		back_btn = findViewById(R.id.back_btn);

		// Set listener to the button
		back_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),selection_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		// Link java button with xml button
		send_btn = findViewById(R.id.send_btn);

		// Set listener to the button
		send_btn.setOnClickListener(new View.OnClickListener() {
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
	
	