
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class records_activity extends Activity {

	// Create button object
	private View _bg__records_ek2;
	private View circle18;
	private View circle17;
	private ImageView battery9;
	private ImageView signal9;
	private ImageView wifi9;
	private TextView _5_30_pm;
	private TextView hello__dissanayake;
	private ImageView profile_img3;
	private ImageView record_menu_icon;
	private View record_navigation_bar;
	private ImageView record_home_logo;
	private ImageView record_history_logo;
	private ImageView record_checkout_logo;
	private ImageView record_profile_logo;
	private TextView purchase_history;
	private View download_btn;
	private TextView download_bill;
	private View record__background_;
	private TextView date__08_12_2021_order_number__12903_total_amount__rs___2500;
	private TextView date__10_09_2021_order_number__312324_total_amount__rs___5000;
	private TextView date__05_01_2020_order_number__8678_total_amount__rs___1500;
	private TextView date__03_10_2019_order_number__09975_total_amount__rs___500;
	private View scroll_wheel;
	private TextView more_info_____;
	private TextView more_info______ek1;
	private TextView more_info______ek2;
	private TextView more_info______ek3;
	private TextView note_only_the_latest_bill_can_be_edited___downloaded;
	private View record_edit_btn;
	private TextView edit_bill;
	private View record_delete_btn;
	private TextView delete_order;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.records);

		// Link java button with xml button
		record_home_logo = findViewById(R.id.record_home_logo);

		// Set listener to the button
		record_home_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),welcome_coffee_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		profile_img3 = findViewById(R.id.profile_img3);
		profile_img3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),profile_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		record_checkout_logo = findViewById(R.id.record_checkout_logo);
		record_checkout_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),checkout_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		record_profile_logo = findViewById(R.id.record_profile_logo);
		record_profile_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),profile_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});


	}
}
	
	