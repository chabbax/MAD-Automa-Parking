
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class checkout_activity extends Activity {

	// Create button object
	private View _bg__checkout_ek2;
	private View circle16;
	private View circle15;
	private ImageView battery8;
	private ImageView signal8;
	private ImageView wifi8;
	private TextView _5_30_pm_ek1;
	private TextView hello__dissanayake_ek1;
	private ImageView profile_img2;
	private ImageView checkout_menu_icon;
	private View checkout_navigation_bar;
	private ImageView checkout_home_logo;
	private ImageView checkout_history_logo;
	private ImageView checkout_checkout_logo;
	private ImageView checkout_profile_logo;
	private ImageView checkout_img;
	private ImageView checkout_cardno_textfeild;
	private ImageView checkout_name_textfeild;
	private ImageView checkout_expiry_textfeild;
	private ImageView checkout_cvv_textfeild;
	private TextView card_number;
	private TextView full_name;
	private TextView expiry_date;
	private TextView cvv;
	private ImageView mastercard_img;
	private View bill_background;
	private TextView quantity_item_price;
	private TextView _2_latte_rs___1000_1_expresso_rs___1500;
	private ImageView barcode;
	private View total_amount;
	private TextView rs___25000;
	private View cancle_btn;
	private TextView cancel_order;
	private TextView total__;
	private ImageView paypal_img;
	private ImageView visa_img;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.checkout);

		// Link java button with xml button
		total_amount = findViewById(R.id.total_amount);

		// Set listener to the button
		total_amount.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),records_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		cancle_btn = findViewById(R.id.cancle_btn);
		cancle_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),welcome_coffee_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		profile_img2 = findViewById(R.id.profile_img2);
		profile_img2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),profile_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		checkout_history_logo = findViewById(R.id.checkout_history_logo);
		checkout_history_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),records_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		checkout_profile_logo = findViewById(R.id.checkout_profile_logo);
		checkout_profile_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),profile_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		checkout_home_logo = findViewById(R.id.checkout_home_logo);
		checkout_home_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),welcome_coffee_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

	
	}
}
	
	