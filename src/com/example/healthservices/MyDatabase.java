package com.example.healthservices;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {
	
	
	public final static String DB_NAME="iddatabase.db";
	public final static int DB_VERSION=1;
	public final static String TABLE_NAME="idtable";
	public final static String TABLE_ID="id";
	
	public final static String CREATE_NAME="create table "+TABLE_NAME+" ("+TABLE_ID+" INTEGER)";
	
	
    	

	public MyDatabase(Context context) {
		super(context,DB_NAME, null, DB_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_NAME);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int newVersion, int oldVersion) {
		// TODO Auto-generated method stub
    db.execSQL("drop table if exists "+TABLE_NAME);
	}

}
