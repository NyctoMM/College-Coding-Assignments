package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class FeedReaderDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1; //Required;
    //if you change the database schema, then increment this value by 1
    //if you do increment this, use onUpgrade() will be automatically  called,
    // and the database will be wiped a nd recreated

   // Database file will be called this:
    public static final String DATABASE_NAME = "FeedReader.db";
        //This is the table
    public FeedReaderDBHelper(@Nullable Context context,
                              @Nullable String name,
                              @Nullable SQLiteDatabase.CursorFactory factory,
                              int version) {
        super(context, name, factory, version);

    }
        //Please create some sort of database
    @Override
    public void onCreate(SQLiteDatabase db) {
        //run the query with execSQL()
        db.execSQL(FeedReaderContact.FeedEntry.SQL_CREATE_ENTRIES);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int ii) {

    }
    //Inserting Movie Data eta *user input*
    public long insert (String title, String yearMade) {

        //access the database;
        SQLiteDatabase db = this.getWritableDatabase();
        //will be used to add data to a query:
        ContentValues contentValues = new ContentValues();

        //add data to the query (ppoulate the data):
        contentValues.put(FeedReaderContact.FeedEntry.COLUMN_NAME_TITLE, title);
        contentValues.put(FeedReaderContact.FeedEntry.COLUMN_NAME_YEAR_MADE, yearMade);

        //execute the query:
        return db.insert(FeedReaderContact.FeedEntry.TABLE_NAME,
                null,
                contentValues);
    }
        //VIEW THE DATA, CRONK
    public Cursor getData() {
        //access the database:
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "SELECT * FROM " + FeedReaderContact.FeedEntry.TABLE_NAME;

        Cursor data = db.rawQuery(query, null);

        return data;
    }
}
