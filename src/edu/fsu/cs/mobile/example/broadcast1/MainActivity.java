package edu.fsu.cs.mobile.example.broadcast1;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	MyBroadcastReceiver receiver; 
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        receiver = new MyBroadcastReceiver();
        IntentFilter filter = new IntentFilter(Intent.ACTION_CALL_BUTTON);
        
        registerReceiver(receiver, filter);
    }
    
    @Override
    public void onDestroy()
    {
    	unregisterReceiver(receiver);
    	
    	super.onPause();
    }
}