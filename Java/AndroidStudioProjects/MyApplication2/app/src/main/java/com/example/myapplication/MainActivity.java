package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Class Members
    private static final String TAG = "MainActivity";
    private static final String DATABASE_NAME = "FeedReaderDBHelper.db";

    //Data Members
    FeedReaderDBHelper feedReaderDBHelper;

    //Establish the buttons, child
    Button insertRecordButton;
    Button viewRecordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertRecordButton = findViewById(R.id.insertRecordButton);
        viewRecordButton = findViewById(R.id.viewRecordButton);

        //onClick listeners
            //This is specifcally to add a movie
        insertRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedReaderDBHelper.insert("Star Wars", "1997");
            }
        });
            //This is speicifcally to view the movie data
        viewRecordButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayMovieData();
            }
        }));

        //this will create the database if it doesn't exist
        //this will call the feedReaderDBHelper's onCreate()
        //automatically
        //if the version number changes, then onUpgrade() will be called as well
        feedReaderDBHelper = new FeedReaderDBHelper(this, DATABASE_NAME, null, FeedReaderDBHelper.DATABASE_VERSION);

    }

    private void displayMovieData() {
        Cursor cursor = feedReaderDBHelper.getData();

        Log.d(TAG, "displayMovieData() ");
        //loopo through results
        //move to the next data set
        while(cursor.moveToNext()) {
            /*og.d(TAG, cursor.getString(cursor.getColumnIndex("_id")));
            Log.d(TAG, cursor.getString(cursor.getColumnIndex("title")));
            Log.d(TAG, cursor.getString(cursor.getColumnIndex("yearMade"))); */
            Log.d(TAG, cursor.getString(0));
            Log.d(TAG, cursor.getString(1));
            Log.d(TAG, cursor.getString(2));
         }
        //Please close the data
        cursor.close();
    }


}