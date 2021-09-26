
package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.view.WindowManager;
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
		// Hide the status bar
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.contact_us);

		// Creating intent object with ACTION_SEND
		// Defining the URL protocol as mailto
		// Let the intent object to use above protocol
		// Specify the recipients (String array)
		// Launch the chooser which can handle this email intent

		Intent intent = new Intent(Intent.ACTION_SEND);
		Intent chooser;
		intent.setData(Uri.parse("mailto:"));
		intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"automaparking@gmail.com"});
		intent.putExtra(Intent.EXTRA_SUBJECT, "Type your inquiry here");
		intent.putExtra(Intent.EXTRA_TEXT, "Explain your problem here");
		intent.setType("text/plain");
		chooser = Intent.createChooser(intent, "Send email");

		// Link java button with xml button
		send_btn = findViewById(R.id.send_btn);

		// Set listener to the buttton
		send_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Launch gmail pop-up
				startActivity(chooser);
			}
		});

		back_btn = findViewById(R.id.back_btn);
		back_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),selection_activity.class);
				// Launch next activity
				startActivity(i);
			}
		});

	}
}
	
	