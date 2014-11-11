package com.example.smartkids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler=new Handler();
       handler.postDelayed(new Runnable(){

		@Override
		public void run()
		{
			
			Intent intent=new Intent(MainActivity.this, Home.class);
			startActivity(intent);
		}
    	   
       },3000);
    }
   
}
