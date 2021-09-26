
package exportkit.xd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class welcome_coffee_activity extends Activity {

	// Create button object
	public ListView listView;
	private ImageView profile_img1;
	private ImageView welcome_history_logo;
	private ImageView welcome_checkout_logo;
	private ImageView welcome_profile_logo;
	private View order_btn;

	// Arrays for items in the shop
	String title[] = {"Cappuccino","Expresso Coffee","Latte Coffee","Black","Coffee Latte"};
	String description[] = {"Rs/- 2500","Rs/- 5000","Rs/-4500","Rs/-9000","Rs/-9999"};
	int image[] = {R.drawable.coffee,R.drawable.coffee,R.drawable.coffee,R.drawable.coffee,R.drawable.coffee};

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
				Intent i = new Intent(getApplicationContext(), AddOrder.class);
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
				Intent i = new Intent(getApplicationContext(),Records.class);
				// Launch next activity
				startActivity(i);
			}
		});

		welcome_checkout_logo = findViewById(R.id.welcome_checkout_logo);
		welcome_checkout_logo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), AddOrder.class);
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

		// Set adapter
		listView = findViewById(R.id.listView);
		CustomeAdapter adapter = new CustomeAdapter(this, title, image, description);
		listView.setAdapter(adapter);
	}
}

class CustomeAdapter extends ArrayAdapter<String>{

	// creating objects of adapter class
	Context context;
	int [] images;
	String [] title;
	String [] des;

	CustomeAdapter(Context context, String[] title, int[] images, String[] des){
		super(context, R.layout.list_view, R.id.title, title);
		this.context = context;
		this.images = images;
		this.title = title;
		this.des = des;
	}

	@NonNull
	@Override
	public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		// converting list_view.xml to a java object
		View row = inflater.inflate(R.layout.list_view, parent,false);

		// creating ListView in activity and get reference to that ListView
		ImageView imageView = row.findViewById(R.id.imageView);
		TextView titleView = row.findViewById(R.id.title);
		TextView descriptionView = row.findViewById(R.id.description);

		// Set images dynamically
		imageView.setImageResource(images[position]);
		titleView.setText(title[position]);
		descriptionView.setText(des[position]);

		return row;
	}
}

	