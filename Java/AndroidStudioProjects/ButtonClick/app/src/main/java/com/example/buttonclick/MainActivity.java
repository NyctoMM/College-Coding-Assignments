package com.example.buttonclick;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        //Instead of creating a new widget,
        //we will hook into an existing one:

        Button cancelButton;
        EditText userInput;

        int  buttonClickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate with findViewBuyId(), not 'new'

        cancelButton = findViewById(R.id.cancelButton);
        userInput =  findViewById(R.id.userInput);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String userInputString = userInput.getText().toString();

                Log.d( "onClMainActivity: ",  "userInputString");
            }


        };

        //set the onclick listener
        cancelButton.setOnClickListener(onClickListener);



    }
}