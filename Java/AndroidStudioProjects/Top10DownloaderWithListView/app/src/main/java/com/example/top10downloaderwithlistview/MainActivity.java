package com.example.top10downloaderwithlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ExecutorAndHandler";

    // data members
    private ListView listApps;

    private Button loadXMLButton;

    //String url = "https://feeds.megaphone.fm/ADL9840290619"; // True Crime RSS feed


    String url = "http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/toppaidapplications/limit=10/xml";

    ParseApplications parseApplications = new ParseApplications();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, " onCreate() start");

        // Instantiations
        // Widgets
        listApps = findViewById(R.id.xmlListView);
        loadXMLButton = findViewById(R.id.loadXMLButton);


        loadXMLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");

                StartExecutor();

            }
        });

    }  // end 0nCreate()

    private void StartExecutor() {

        //ExecutorService executor = Executors.newSingleThreadExecutor();
        // or
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Handler handler = new Handler(Looper.getMainLooper());

        executor.execute(new Runnable() {
            @Override
            public void run() { //Background work here

                String rssFeed = downloadXML(url);

                parseApplications.parse(rssFeed);

                DataFeedAdapter dataFeedAdapter = new DataFeedAdapter(
                        MainActivity.this,
                        R.layout.list_record,
                        parseApplications.getApplications());


                // See how many records there are:
                //Log.d(TAG, "getCount(): " + dataFeedAdapter.getCount());

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        //UI Thread work here
                        listApps.setAdapter(dataFeedAdapter);
                    }
                });


                if(rssFeed == null) { Log.e(TAG, "Error downloading RSS feed"); }
            }

        });


        Log.d(TAG, "executor.shutdown() ");
        executor.shutdown();

    }


    private String downloadXML(String urlString) {
        // Common theme - Open HTTP connection
        // - uses InputStreamReader()

        StringBuilder xmlResult = new StringBuilder();

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Two options for instantiation:

                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader);
            // Or
            //BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));


            int charsRead;
            char[] inputBuffer = new char[50];

            while(true) {

                charsRead = reader.read(inputBuffer);  // needs inputBuffer argument
                if(charsRead < 0) {
                    // signals the end of the stream of data (-1?)
                    Log.d(TAG,"end of stream");
                    break;
                }
                if(charsRead >= 0) {   // number of characters read from the stream
                    xmlResult.append(String.copyValueOf(inputBuffer, 0, charsRead));
                    //Log.d(TAG, "appending to xmlResult: ");

                }

            }

            // Close the streams
            inputStream.close();
            inputStreamReader.close();
            reader.close();
            connection.disconnect();

        } catch (MalformedURLException e) {
            Log.e(TAG, "malformed url: ");
            Log.e(TAG, "e.getMessage(): " + e.getMessage());
            e.printStackTrace();
        }
        catch (SecurityException e) {
            Log.e(TAG, "security exception");
            e.printStackTrace();
        }
        catch (IOException e) {
            Log.e(TAG, "unknown exception");
            Log.e(TAG, e.toString());
            e.printStackTrace();
        }
        finally {
            Log.d(TAG, "finally block");

        }

        //return null;
        return xmlResult.toString();

    }

}
