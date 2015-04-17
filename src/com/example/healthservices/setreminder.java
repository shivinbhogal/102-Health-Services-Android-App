package com.example.healthservices;
import java.util.ArrayList;
import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class setreminder extends Activity implements OnClickListener {
	
	EditText editmsg;
	DatePicker datepicker;
	TimePicker timepicker;
	Button set,cancelallreminders;
	MyDatabase md;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setreminder);
		NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.cancelAll();
		editmsg=(EditText)findViewById(R.id.editText1);
		datepicker=(DatePicker)findViewById(R.id.datePicker1);
		timepicker=(TimePicker)findViewById(R.id.timePicker1);
		set=(Button)findViewById(R.id.setbutton);
		set.setOnClickListener(this);
		cancelallreminders=(Button)findViewById(R.id.cancellallremindersbtn);
		cancelallreminders.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		Intent myserviceintent= new Intent();
		
		switch (view.getId()) {
		case R.id.setbutton:
			md = new MyDatabase(this);
			SQLiteDatabase sd=md.getWritableDatabase();
			String message=editmsg.getText().toString();
			Calendar calendar=Calendar.getInstance();
			calendar.set(Calendar.MONTH,datepicker.getMonth());
			calendar.set(Calendar.DAY_OF_MONTH,datepicker.getDayOfMonth());
			calendar.set(Calendar.YEAR,datepicker.getYear());
			calendar.set(Calendar.HOUR_OF_DAY,timepicker.getCurrentHour());
			calendar.set(Calendar.MINUTE,timepicker.getCurrentMinute());
			
			AlarmManager alarmManager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
			
		    myserviceintent.setClass(this, MyNotificationService.class);
		    myserviceintent.putExtra("msg", message);
		    int id=(int)System.currentTimeMillis();
		    ContentValues cv= new ContentValues();
		    cv.put(md.TABLE_ID, id);
		    sd.insert(md.TABLE_NAME, md.TABLE_ID, cv);
		    cv.clear();
		    sd.close();
		    md.close();
		    
		    PendingIntent pendingIntent=PendingIntent.getService(this, 0, myserviceintent, PendingIntent.FLAG_UPDATE_CURRENT);
		    alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(), pendingIntent);
		    
		    
		    //startService(myserviceintent);
		    Intent returntoreminderfragment = new Intent("com.example.healthservices.MAINACTIVITY");
			startActivity(returntoreminderfragment);
		    
			break;
      case R.id.cancellallremindersbtn:
    	    cancelallids();
		default:
			break;
		}
		
	}
	
   private void cancelallids(){
	   md= new MyDatabase(this);
	   SQLiteDatabase sd = md.getReadableDatabase();
	   Cursor cursor= sd.query(md.TABLE_NAME, null, null, null, null, null, null);
	   ArrayList<Integer> idlist=new ArrayList<Integer>();
	   while(cursor.moveToNext())
	   {idlist.add(cursor.getInt(0));
	   }   
	   cursor.close();
	   sd.close();
	   
	   for (int i = 0; i < idlist.size(); i++) {
		   AlarmManager alarmManager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
		   Intent myserviceintent= new Intent();
		   myserviceintent.setClass(this, MyNotificationService.class);
		   PendingIntent pendingIntent=PendingIntent.getService(this, idlist.get(i), myserviceintent, PendingIntent.FLAG_UPDATE_CURRENT);
		   alarmManager.cancel(pendingIntent);
		   }
	   sd=md.getWritableDatabase();
	   sd.delete(md.TABLE_NAME, null, null);
	   sd.close();
   }
}
