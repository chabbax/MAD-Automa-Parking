
package exportkit.xd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

public class checkout_activity extends Activity {

	// Create button object
	private EditText title, desc;
	private View add;
	private DbHandlerOrder dbHandler ;
	private Context context;
	private ImageView profile_img2;
	private ImageView checkout_home_logo;
	private ImageView checkout_history_logo;
	private ImageView checkout_profile_logo;
	private View cancle_btn;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.checkout);

		// Link java button with xml button
		title = findViewById(R.id.type_name);
		desc = findViewById(R.id.type_cardno);
		add = findViewById(R.id.pay);

		context = this;
		dbHandler  = new DbHandlerOrder(context);

		// Set listener to the button
		add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String userTitle = title.getText().toString();
				String userDesc = desc.getText().toString();
				long started = System.currentTimeMillis();

				Order create = new Order(userTitle,userDesc,started,0);
				dbHandler.addCreate(create);

				startActivity(new Intent(context,records_activity.class));
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
	
	