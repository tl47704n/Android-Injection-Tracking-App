package com.teddycathy.msinjection4;
import android.database.Cursor;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper2 extends SQLiteOpenHelper{

		public static final String DATABASE_NAME = "ReportIssue.db";
		public static final String TABLE_NAME1 = "SWELLING";
		public static final String TABLE_NAME2 = "REDNESS";
		public static final String TABLE_NAME3 = "RASH";
		public static final String TABLE_NAME4 = "BRUISING";
		public static final String TABLE_NAME5 = "PAIN";
		public static final String TABLE_NAME6 = "OTHER";
		public static final String COL_1 = "CONTENT";
		private Cursor res;
		private String data;
	public DatabaseHelper2(Context context) {
		super(context, DATABASE_NAME, null, 1);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table " + TABLE_NAME1 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, CONTENT TEXT)");
		db.execSQL("create table " + TABLE_NAME2 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, CONTENT TEXT)");
		db.execSQL("create table " + TABLE_NAME3 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, CONTENT TEXT)");
		db.execSQL("create table " + TABLE_NAME4 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, CONTENT TEXT)");
		db.execSQL("create table " + TABLE_NAME5 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, CONTENT TEXT)");
		db.execSQL("create table " + TABLE_NAME6 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, CONTENT TEXT)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME1);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME2);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME3);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME4);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME5);
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME6);
		onCreate(db);
	}
	public boolean insertData1(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME1,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}
	public boolean insertData2(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME2,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}
	public boolean insertData3(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME3,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}
	public boolean insertData4(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME4,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}	
	public boolean insertData5(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME5,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}
	public boolean insertData6(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME6,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}	

	public Cursor getData1(){
		SQLiteDatabase db = this.getWritableDatabase();
		 res = db.rawQuery("select * from " + TABLE_NAME1,null);
		Log.e("...","data = ==  "+res);
		return res;
	}	
	public Cursor getData2(){
		SQLiteDatabase db = this.getWritableDatabase();
		 res = db.rawQuery("select * from " + TABLE_NAME2,null);
		Log.e("...","data = ==  "+res);
		return res;
	}	
	public Cursor getData3(){
		SQLiteDatabase db = this.getWritableDatabase();
		 res = db.rawQuery("select * from " + TABLE_NAME3,null);
		Log.e("...","data = ==  "+res);
		return res;
	}	
	public Cursor getData4(){
		SQLiteDatabase db = this.getWritableDatabase();
		 res = db.rawQuery("select * from " + TABLE_NAME4,null);
		Log.e("...","data = ==  "+res);
		return res;
	}	
	public Cursor getData5(){
		SQLiteDatabase db = this.getWritableDatabase();
		 res = db.rawQuery("select * from " + TABLE_NAME5,null);
		Log.e("...","data = ==  "+res);
		return res;
	}	
	public Cursor getData6(){
		SQLiteDatabase db = this.getWritableDatabase();
		 res = db.rawQuery("select * from " + TABLE_NAME6,null);
		Log.e("...","data = ==  "+res);
		return res;
	}	
		
	public String fetchdata(){
		if (res.moveToFirst()){
			   while(!res.isAfterLast()){
			       data = res.getString(res.getColumnIndex("CONTENT"));
			      // do what ever you want here
			      Log.e("../.", " --->"+data);
			      res.moveToNext();
			   }
			}
			res.close();
			return data;
	}
	
}
