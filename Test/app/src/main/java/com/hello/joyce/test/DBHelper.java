package com.hello.joyce.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private final static int _DBVersion = 1; //<-- 版本
    private final static String _DBName = "cureplan.db";  //<-- db name
    private final static String _TableName = "record"; //<-- table name
    public final static  String Column_ID = "_id";
    public final static String Column_Date = "actiondate";
    public final static String Column_Name = "actionname";
    public final static String Column_Time = "actiontime";

    public DBHelper(Context context) {
        super(context, _DBName, null, _DBVersion);
        // TODO Auto-generated constructor stub
    }
    //Create a new table
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        final String SQL = "CREATE TABLE " + _TableName + "( " + Column_ID +
                          "INTEGER PRIMARY KEY AUTOINCREMENT, " + Column_Date +
                          "TEXT," + Column_Name +
                          "TEXT," + Column_Time +
                          "TEXT);";
        db.execSQL(SQL);
    }
    //Update the table if it is exists
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + _TableName);
        onCreate(db);
    }

    //Add a new action to the database
    public void addaction(ActionProducts actionproducts){
        ContentValues values = new ContentValues();
        values.put(Column_Name, actionproducts.get_aciotnname());
        values.put(Column_Date, actionproducts.get_actiondate());
        values.put(Column_Time, actionproducts.get_actiontime());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(_TableName, null, values);
        db.close();
    }
    //Delete an action from database
    public void deleteaction(String actionName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + _TableName + " WHERE " +Column_Name + "=\""+actionName+"\";");
    }
}
