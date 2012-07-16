package edu.fsu.cs.mobile.example.broadcast1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityToBeLaunched extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    TextView tv = new TextView(this);
	    tv.setText("This Activity was launched from a BroadcastReceiver");
	    setContentView(tv);
	}

}
