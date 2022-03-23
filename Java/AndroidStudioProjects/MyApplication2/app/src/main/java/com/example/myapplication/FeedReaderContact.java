package com.example.myapplication;


import android.provider.BaseColumns;

public class FeedReaderContact {

    //Make sure this can't be instantiated directly:
    //the Android System will dod it for us
    private FeedReaderContact() { }

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "movies";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_YEAR_MADE = "yearMade";


        //create table command
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                        FeedEntry._ID + "  INTEGER PRIMARY KEY, " +
                        FeedEntry.COLUMN_NAME_TITLE + "TEXT, " +
                        FeedEntry.COLUMN_NAME_YEAR_MADE + " TEXT)";

        //Drop table command - called automatically in an SQLiteOpenHelper
        ///Classes onUpgrade() Method
        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS" + FeedEntry.TABLE_NAME;
    }
}
