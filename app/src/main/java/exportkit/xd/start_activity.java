
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class start_activity extends Activity {

	// Create button object
	private View _bg__start_ek2;
	private View start_background_grey;
	private View circle12;
	private View circle11;
	private ImageView battery6;
	private ImageView signal6;
	private ImageView wifi6;
	private TextView _5_30_pm_ek3;
	private ImageView logo_img;
	private TextView coffee_;
	private ImageView start_img;
	private TextView order_a_coffee_right_to_your_parking_spot;
	private TextView do_you_want_to_be_energized_before_shopping_with_your_wife__maybe_you_have_a_long_drive_ahead_of_you__when_you_are_in_process_of_parking_your_car_or_leaving_you_have_the_option_of_getting_a_coffee_delivered_right_to_your_parking_slot_;
	private View getstarted_btn;
	private TextView get_started;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);

		// Link java button with xml button
		getstarted_btn = findViewById(R.id.getstarted_btn);

		// Set listener to the button
		getstarted_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),welcome_coffee_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

	}
}
	
	