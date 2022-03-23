package com.example.rss_feed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String urlString = "";

        urlString = "http://ax.itunes.apple.com/WebOjbects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml";
        //Create an object from out DataStream Class

        ExecutorService executorService = Executors.newSingleThreadExecutor(); //one thread
       // ExecutorService executorService = Executors.newFixedThreadPool(2);
        Handler handler = new Handler(Looper.getMainLooper());

        executorService.execute(new Runnable () {
        @Override
            public void run() {

                String rssFeed = downloadXml(urlString);
        }

        }
        );
    }

    private  String downloadXML(String urlString) {
    StringBuilder xmlResult = new StringBuilder(); // we will return the .toString() version of this

    try { // try the server access here
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    }
    catch (Exception e) { //If anything goes wrong handle here
        Log.e(TAG, "Unknown Exception");
    }
    return xmlResult.toString();
    }
/*
    //Inner Class

    private class DataStream extends AsyncTask<String, Void, String> {

        //This function will be used to do anything

        @Override
        protected String doInBackground(String... strings) {
            Log.d(TAG, "Calling dodInBackground");
            return null;
        }
    }
*/
} //end of activity