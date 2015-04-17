package com.example.healthservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.ImageView;


public class ReminderFragment extends Fragment{
	
	Button seeallreminders;
	ImageView addareminderimage;
	@Override
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) { 
		// TODO Auto-generated method stub
		View v;
		v=inflater.inflate(R.layout.reminder_layout, container, false);
		
		addareminderimage=(ImageView)v.findViewById(R.id.addareminderimage);
		addareminderimage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				addareminderimage.setImageResource(R.drawable.copyofimageedit_6_4607877913);
				Intent opensetreminderactivityfromimage = new Intent("com.example.healthservices.SETREMINDER");
    			startActivity(opensetreminderactivityfromimage);
				
			}
		});
        
	       
		seeallreminders=(Button)v.findViewById(R.id.seeallreminders);
		 seeallreminders.setOnClickListener(new View.OnClickListener() {                       
	            @Override
	            public void onClick(View v) {
	            	Intent openseeallremindersractivity = new Intent("com.example.healthservices.SEEALLREMINDERS");
	    			startActivity(openseeallremindersractivity);
	            }

	        });
		return v;
		

	}
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		addareminderimage.setImageResource(R.drawable.imageedit_6_4607877913);
	}
	
	}
