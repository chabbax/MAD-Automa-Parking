
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class selection_activity extends Activity {

	// Create button object
	private View _bg__selection_ek2;
	private View circle20;
	private View circle19;
	private TextView _5_30_pm_ek4;
	private ImageView battery10;
	private ImageView signal10;
	private TextView automa_parking;
	private ImageView wifi10;
	private TextView lets_start_;
	private View booking_btn;
	private View parking_ticket_btn;
	private View order_coffee_btn;
	private View carwash_btn;
	private ImageView selection_profile_pic;
	private TextView please_choose_the_service_you_require;
	private ImageView selection_img;
	private TextView buy_a_parking_ticket;
	private TextView booking_a_ticket;
	private TextView order_a_coffee;
	private TextView order_an_carwash;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
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

	}
}
	
	