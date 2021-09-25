
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class welcome_coffee_activity extends Activity {

	// Create button object
	private View _bg__welcome_coffee_ek2;
	private View expresso_bakcground;
	private View circle14;
	private View circle13;
	private ImageView battery7;
	private ImageView signal7;
	private ImageView wifi7;
	private TextView _5_30_pm_ek2;
	private TextView hello__dissanayake_ek2;
	private ImageView profile_img1;
	private ImageView welcome_menu_icon;
	private ImageView search_bar;
	private ImageView list_icon;
	private ImageView search_icon;
	private TextView search_coffee;
	private TextView coffee;
	private TextView espresso;
	private TextView cappuccino;
	private View line_1;
	private View expresso_background;
	private View order_background;
	private TextView latte;
	private ImageView welcome_coffee1_img;
	private TextView espresso_ek1;
	private TextView save_and_quick_order_your_favorite_coffee;
	private TextView instant_order;
	private TextView espresso_is_simply_a_small_amount_of_nearly_boiling_water_is_forced_under_9_10_bars_of_pressure_through_finely_ground_coffee_beans_;
	private ImageView star6;
	private ImageView star7;
	private ImageView star8;
	private ImageView star9;
	private ImageView star10;
	private ImageView select_btn;
	private View cappuccino_background;
	private View cappuccino_descrip;
	private TextView cappuccino_ek1;
	private TextView this_is_a_drink_involve_the_use_of_cream_instead_of_milk__using_non_dairy_milk_substitutes_and_flavoring_with_cinnamon_or_chocolate_powder_;
	private ImageView star5;
	private ImageView star4;
	private ImageView star3;
	private ImageView star2;
	private ImageView star1;
	private ImageView welcome_coffee2_img;
	private View welcome_navigation_bar;
	private ImageView welcome_home_logo;
	private ImageView welcome_history_logo;
	private ImageView welcome_checkout_logo;
	private ImageView welcome_profile_logo;
	private ImageView order_img;
	private View order_btn;
	private TextView order_now;

	// Arrays for items in the shop
	String title[] = {"Coffee Black","Expresso Coffee","Light Coffee","Cappuccino","Coffee Latte"};
	String description[] = {"Rs/- 2500","Rs/- 5000","Rs/-4500","Rs/-9000","Rs/-9999"};
	int image[] = {R.drawable.Black,R.drawable.Expresso,R.drawable.Light,R.drawable.Cappochunio,R.drawable.Latte};

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.welcome_coffee);

		// Link java button with xml button
		order_btn = findViewById(R.id.order_btn);

		// Set listener to the button
		order_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Create intent
				Intent i = new Intent(getApplicationContext(),checkout_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		profile_img1 = findViewById(R.id.profile_img1);
		profile_img1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),profile_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		welcome_history_logo = findViewById(R.id.welcome_history_logo);
		welcome_history_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),records_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		welcome_checkout_logo = findViewById(R.id.welcome_checkout_logo);
		welcome_checkout_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),checkout_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

		welcome_profile_logo = findViewById(R.id.welcome_profile_logo);
		welcome_profile_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),profile_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

	}
}
	
	