package com.example.onrestoreexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText emailName;

    Button consoleButton;

    String FIRSTNAME_CONSTANT = "Test1";
    String LASTNAME_CONSTANT = "Test2";
    String EMAILNAME_CONSTANT = "Test3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        emailName = findViewById(R.id.emailName);
        consoleButton = findViewById(R.id.consoleButton);

        consoleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Log.d("MainActivity", FIRSTNAME_CONSTANT);
                Log.d("MainActivity", LASTNAME_CONSTANT);
                Log.d("MainActivity", EMAILNAME_CONSTANT);
            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("MainActivity", "onSaveInstanceState in");
        super.onSaveInstanceState(outState);
        outState.putString(FIRSTNAME_CONSTANT, firstName.getText().toString());
        outState.putString(LASTNAME_CONSTANT, lastName.getText().toString());
        outState.putString(EMAILNAME_CONSTANT, emailName.getText().toString());
        Log.d("MainActivity", "onSaveInstanceState out");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("MainActivity", "onRestoreInstanceState in");
        super.onRestoreInstanceState(savedInstanceState);

        //Repopulating the Text box I guess
        firstName.setText(savedInstanceState.getString(FIRSTNAME_CONSTANT));
        lastName.setText(savedInstanceState.getString(LASTNAME_CONSTANT));
        emailName.setText(savedInstanceState.getString(EMAILNAME_CONSTANT));

        Log.d("MainActivity", "onRestoreInstanceState out");
    }


    @Override
    protected void onStart(){
        super.onStart();
    }
    @Override
    protected void onResume(){
        super.onResume();

    }
    @Override
    protected void onPause(){
        super.onPause();

    }
    @Override
    protected void onStop(){
        super.onStop();

    }
    @Override
    protected void onRestart(){
        super.onRestart();

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();

    }
}