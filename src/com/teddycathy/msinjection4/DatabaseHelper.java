package com.teddycathy.msinjection4;
import android.database.Cursor;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper{

		public static final String DATABASE_NAME = "Setting.db";
		public static final String TABLE_NAME = "setting_table";
		public static final String COL_1 = "NAME";
		public static final String COL_2 = "EMAIL";

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, EMAIL TEXT)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
		onCreate(db);
	}
	public boolean insertData(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_1,name);

		long result = db.insert(TABLE_NAME,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}
	public boolean insertData2(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put(COL_2,name);

		long result = db.insert(TABLE_NAME,null,contentValues);
		if (result==-1){
			return false;
		}else {
			return true;
		}

	}
	public Cursor getAllData(){
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor res = db.rawQuery("select * from " + TABLE_NAME,null);
		return res;
	}	
	

}
