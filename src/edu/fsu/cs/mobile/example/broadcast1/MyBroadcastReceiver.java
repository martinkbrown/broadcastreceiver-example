package edu.fsu.cs.mobile.example.broadcast1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

	private final static String TAG = "MyBroadcastReceiver";
	
	@Override
	public void onReceive(Context context, Intent intent) {
	    
		Intent myIntent = new Intent(context, ActivityToBeLaunched.class);
		
		Log.i(TAG, "Broadcast received:" + intent.toString());
		
		Toast.makeText(
				context, 
				"Broadcast Received!", 
				Toast.LENGTH_LONG).show();
		
		context.startActivity(myIntent);
	}

}
