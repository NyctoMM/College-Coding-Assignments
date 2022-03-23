package com.example.userinputedittext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInputMoment;
    Button buttonInputMoment;
    TextView outputView;


    int numberButton = 0;
    String TEXT_CONTENTS = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() Called in");

        //widget instantiations
        userInputMoment = findViewById(R.id.userInputMoment);
        buttonInputMoment = findViewById(R.id.buttonInputMoment);
        outputView = findViewById(R.id.outputView);


        buttonInputMoment.setText("Please add your first item");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //output to log on button click
                String inputText = userInputMoment.getText().toString();
                //1. First Way to Get Text Input:
                //Set text for a widget:
                //String inputText = userInputMoment.getText().toString();

                //2. Second way to get Text Input:
                //Using the EditText's Editable Object:
                Editable e = userInputMoment.getText();

                //This is Setting a text
                if(numberButton == 0) {
                    outputView.setText(e);
                    numberButton = numberButton + 1;
                    buttonInputMoment.setText("Please enter another item");
                }

                //Using append to add to the end of output View
                else {
                    outputView.append("\n" + e);
                }


            }

        };
        buttonInputMoment.setOnClickListener(onClickListener);
        outputView.setMovementMethod(new ScrollingMovementMethod());
        Log.d("MainActivity", "onCreate() Called out");

    }

    @Override
    protected void onPause() {
        super.onPause(); //Required;
        Log.d("MainActivity", "onPause called in");
        Log.d("MainActivity", "onPause called out");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop() called in");
        Log.d("MainActivity", "onStop() called out");
    }


    protected void OnDestory() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy() in");
        Log.d("MainActivity", "onDestroy() out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //Save Data using the bundle
        outState.putString(TEXT_CONTENTS, userInputMoment.getText().toString());
    }


    protected void OnRestoreInstanceState(Bundle savedInstanceState) {
        //repopulate the EditText:
        //userInputMoment.setText(savedInstanceState.getString(TEXT_CONTENTS));
    }
}