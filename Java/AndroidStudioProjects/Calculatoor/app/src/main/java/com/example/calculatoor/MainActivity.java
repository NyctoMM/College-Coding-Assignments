package com.example.calculatoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText resultView;
    private EditText newNumberBox;
    private TextView operationBox;

    private Double operand1 = null;
    private Double operand2 = null;

    private String pendingOperation = "=";

    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (EditText) findViewById(R.id.resultView);
        newNumberBox = (EditText) findViewById(R.id.newNumberBox);
        operationBox = (TextView) findViewById(R.id.operationBox);

        Button b0 = findViewById(R.id.b0); // 0

        Button b1 = findViewById(R.id.b1); //7
        Button b2 = findViewById(R.id.b2); // 8
        Button b3 = findViewById(R.id.b3); // 9

        Button b4 = findViewById(R.id.b4); // Divide
        Button b5 = findViewById(R.id.b5); // 5
        Button b6 = findViewById(R.id.b6); // 6
        Button b7 = findViewById(R.id.b7); // 7

        Button b8 = findViewById(R.id.b8); // Multiply
        Button b9 = findViewById(R.id.b9); // 1
        Button b10 = findViewById(R.id.b10); // 2
        Button b11 = findViewById(R.id.b11); // 3

        Button b12 = findViewById(R.id.b12); // Minus
        Button b13 = findViewById(R.id.b13); // AllClear
        Button b14 = findViewById(R.id.b14); // Dot
        Button b15 = findViewById(R.id.b15); // Equals
        Button b16 = findViewById(R.id.b16); // Add


        View.OnClickListener digitListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //"Get" whatever  button was pressed:
                Button b = (Button) view; // Explicit Conversion from View to Button

                //Add to the top result text box;
                newNumberBox.append(b.getText().toString()); // Sets Number box to a number :eye:
            }
        };

        b0.setOnClickListener(digitListener); // 0

        b1.setOnClickListener(digitListener); // 7
        b2.setOnClickListener(digitListener); // 8
        b3.setOnClickListener(digitListener); // 9

        b5.setOnClickListener(digitListener); // 4
        b6.setOnClickListener(digitListener); // 5
        b7.setOnClickListener(digitListener); // 6

        b9.setOnClickListener(digitListener); // 1
        b10.setOnClickListener(digitListener); // 2
        b11.setOnClickListener(digitListener); // 3

        View.OnClickListener operationListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view; //Another explicit conversion from View to Button

                //Get values from both text entry and clicked ooperator
                String operation = b.getText().toString();
                String value = newNumberBox.getText().toString();
                String resultValue = resultView.getText().toString();

                //Only perform an operation if we have a user-entered value

                if (value.length() != 0) {
                    performOperation(value, operation);
                }

                pendingOperation = operation;
                operationBox.setText(pendingOperation);

                //Text to see if anything is in the top  box (Result Text Box)

                /*if(operand1 == null) {

                    //Place whatever we had in the bottom (newNumberbox)
                    // into result (top)
                    resultView.setText(value);

                    //sete tthe value of oprandd
                    operand1 = Double.valueOf(newNumberBox.getText().toString());

                    // and reset the bottom text box:
                    newNumberBox.setText("");
                }
                else { //If we already have something in the result box:

                    //take the top value and factor in with whatever
                    //we have in the bottom
                    operand2 = Double.valueOf(newNumberBox.getText().toString());

                    //do the math
                    //use a switch to test for the operation
                    /*
                    if (operation.equals("+")) {

                    }


                    double newResult = 0;

                    switch (operation) {
                        case "+":
                            newResult = operand1 + operand2;
                            //reset bottom text (newNumberBox)
                            resultView.setText(String.valueOf(newResult));
                            newNumberBox.setText("");
                            break;

                        case "-":
                            newResult = operand1 - operand2;
                            //reset bottom text (newNumberBox)
                            resultView.setText(String.valueOf(newResult));
                            newNumberBox.setText("");
                            break;

                        case "*":
                            newResult = operand1 * operand2;
                            //reset bottom text (newNumberBox)
                            resultView.setText(String.valueOf(newResult));
                            newNumberBox.setText("");
                            break;

                        case "/":
                            newResult = operand1 / operand2;
                            //reset bottom text (newNumberBox)
                            resultView.setText(String.valueOf(newResult));
                            newNumberBox.setText("");
                            break;
                    }

                }*/
            }

        };


        b4.setOnClickListener(operationListener); // Divide
        b8.setOnClickListener(operationListener); // Multiply
        b12.setOnClickListener(operationListener); // Minus
        b13.setOnClickListener(operationListener); // CLear
        b14.setOnClickListener(operationListener); // Dot
        b15.setOnClickListener(operationListener); // Equals
        b16.setOnClickListener(operationListener); // Add
    }

        private void performOperation(String value, String operation) {

        //Place whatevver the user entered for an oprator in thte operationBox
            operationBox.setText(operation);

            //if top doesn't have any text:
            if(operand1 == null)
            {
                //take whatever the user entered and dmake it operand 1
                operand1 = Double.valueOf(value);

            }
            //if the user has already  entered a number:
            else {
                operand2 = Double.valueOf(value);


                switch(pendingOperation) {
                    case "=":
                        pendingOperation = operation;
                    break;
                    case "+":
                        operand1 += operand2;
                    break;

                    case "-":
                        operand1 -= operand2;
                    break;

                    case "*":
                        operand1 *= operand2;
                    break;

                    case "/":
                        if(operand2 != 0) {
                            operand1 /= operand2;
                        }
                        else {
                            Log.d("MainActivity", "Division By 0 Not Allowed");
                        }
                    break;
                } //End Switch

            }

            //After we perform the operration, set hte text boxes accordingnly:
            resultView.setText(operand1.toString());
            newNumberBox.setText("");
        }

}