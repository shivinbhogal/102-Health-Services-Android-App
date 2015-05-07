package com.example.healthservices;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyNotificationService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Toast.makeText(this, "Reminder Added",Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "OnDestroy",Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		String message=intent.getStringExtra("msg");
		
		Toast.makeText(this, "OnStart",Toast.LENGTH_SHORT).show();
		NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		Intent notificationIntent=new Intent(this,setreminder.class);
		PendingIntent pendingIntent= PendingIntent.getActivity(this, 0, notificationIntent, 0);
		int icon=R.drawable.ic_launcher;
		String tickerText="You need to take your pills";
		long when= System.currentTimeMillis();
		Notification notification= new Notification(icon,tickerText,when);
		String contentTitle="Intake Reminder:";
		String contentText=message;
		notification.setLatestEventInfo(this, contentTitle, contentText, pendingIntent);
		notification.defaults |= Notification.DEFAULT_SOUND;
		notification.defaults |= Notification.DEFAULT_VIBRATE;
		notificationManager.notify(123, notification);
		
		
		
		
	}

}
