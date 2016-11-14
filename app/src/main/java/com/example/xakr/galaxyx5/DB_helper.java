package com.example.xakr.galaxyx5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xakR on 11/14/2016.
 */

public class DB_helper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="user.db";
    public static final String TABLE_NAME="user_table";
    public static final String COL_1="UTID";
    public static final String COL_2="FNAME";
    public static final String COL_3="MINT";
    public static final String COL_4="LNAME";
    public static final String COL_5="EMAILID";
    public static final String COL_6="PHNUM";


    public DB_helper(Context context ) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase.sqLiteDatabase = this.getWritableDB();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "( UTID INTEGER PRIMARY KEY AUTOINCREMENT, FNAME TEXT, MINT TEXT, LNAME TEXT, EMAILID TEXT, PHNUM INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS TABLE_NAME");
        onCreate(sqLiteDatabase);
    }
}
