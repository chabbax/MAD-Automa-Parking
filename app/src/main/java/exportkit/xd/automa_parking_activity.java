
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.ImageView;

public class automa_parking_activity extends Activity {

	// Create button object
	private View _bg__automa_parking_ek4;
	private View circle2;
	private View circle1;
	private TextView _5_30_pm_ek9;
	private ImageView battery1;
	private ImageView signal1;
	private TextView automa_parking_ek5;
	private ImageView wifi1;
	private TextView automa_parking_is_an_app_which_has_the_capability_of_showing_empty_parking_slots_after_the_pruchase_of_a_ticket_or_a_booking_and_with_our_added_innovation_of_a_coffee_delivery_service_and_a_car_wash_;
	private TextView accept_our_terms___conditions;
	private View start_btn;
	private TextView lets_start__ek1;
	private ImageView automa_parking_img;
	private View tick;
	private ImageView checkbox;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.automa_parking);

		// Link java button with xml button
		start_btn = findViewById(R.id.start_btn);

		// Set listener to the button
		start_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),sign_up_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});
		

	
	}
}
	
	