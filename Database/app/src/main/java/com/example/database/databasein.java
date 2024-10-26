package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasein extends SQLiteOpenHelper {
    static String name="dbs";
    static int version=3;
    public databasein(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE QWE(name text,password text,Place text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS QWE");
        onCreate(sqLiteDatabase);
    }

    public void InsertValues(String s1, String s2, String s3) {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put("Name",s1);
        values.put("Password",s2);
        values.put("Place",s3);

        db.insert("QWE",null,values);

    }

    public Cursor getAllData() {
        SQLiteDatabase vb=this.getWritableDatabase();
        Cursor res =vb.rawQuery("SELECT * FROM QWE",null);
        return res;
    }
}
