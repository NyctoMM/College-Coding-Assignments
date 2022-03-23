package com.example.xmlconnections;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xmlconnections.R;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    String urlString = "https://displate.com/sr-artworks/jellyfish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate() start");



        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());



        executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {

                                        String rssFeed = downloadXml(urlString);

                                    }
                                }
        );
    }
    private String downloadXml(String urlString) {

        StringBuilder xmResult = new StringBuilder();// we will return the .toString()
        // version of this

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int responseCode = connection.getResponseCode();

            Log.d(TAG,"Connection Was Successful");
            Log.d(TAG,"Response Code: " + responseCode);

            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int numCharactersRead;
            char[] inputBuffer = new char[500];

            while(true) {
                numCharactersRead = bufferedReader.read(inputBuffer);

                if(numCharactersRead < 0) {
                    break;
                }


                xmResult.append(String.copyValueOf(inputBuffer,0,numCharactersRead));
            }

            bufferedReader.close();

        }
        catch(MalformedURLException e) {
            Log.e(TAG,"Malformed URL");
            e.printStackTrace();
        }
        catch (Exception e) {  // if anything goes wrong, handle it here
            Log.e(TAG,"Unknown Exception");
            e.printStackTrace();
        }

        return xmResult.toString();

    }

    //AsyncTask is deprecated in API 30

    // Inner class
    private class DataStream extends AsyncTask<String, Void, String> {


        // This function will be used to do anything
        // Will run automatically when we execute in main
        @Override
        protected String doInBackground(String... strings) {
            Log.d(TAG,"calling OnPostExecute()");
            return null;
        }

    }  // end DataStream class




}  // end of MainActivity
