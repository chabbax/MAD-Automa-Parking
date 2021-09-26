
package exportkit.xd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class records_activity extends Activity {

	// Create button object
	private View add;
	public ListView listView;
	public TextView count;
	private ImageView profile_img3;
	private ImageView record_home_logo;
	private ImageView record_checkout_logo;
	private ImageView record_profile_logo;
	Context context;
	private DbHandlerOrder dbHandler;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.records);
		context = this;

		// Link java button with xml button
		record_home_logo = findViewById(R.id.record_home_logo);

		dbHandler = new DbHandlerOrder(context);
		add = findViewById(R.id.create_order_btn);
		listView = findViewById(R.id.record_list);
		count = findViewById(R.id.number);
		context = this;

		// Get order counts from the table
		int countOrder = dbHandler.countOrder();
		count.setText("You have "+countOrder+" orders");

		add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(context,checkout_activity.class));
			}
		});









		// Setting listener to the button
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
	
	