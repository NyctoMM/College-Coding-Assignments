package com.example.userinputedittext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInputMoment;
    Button buttonInputMoment;
    TextView outputView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //widget instantiations
        userInputMoment = findViewById(R.id.userInputMoment);
        buttonInputMoment = findViewById(R.id.buttonInputMoment);
        outputView = findViewById(R.id.outputView);

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
               // outputView.setText(e);

                //Using append to add to the end of output View
                outputView.append("\n"+e);


                buttonInputMoment.setText(inputText);
            }
        };
        buttonInputMoment.setOnClickListener(onClickListener);

    }
}