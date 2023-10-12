package com.example.flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewRoomWidth;
    TextView textViewRoomLength;
    EditText editTextRoomWidth;
    EditText editTextRoomLength;
    Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRoomLength = findViewById(R.id.textViewRoomLength);
        textViewRoomWidth = findViewById(R.id.textViewRoomWidth);
        editTextRoomLength = findViewById(R.id.editTextRoomLength);
        editTextRoomWidth = findViewById(R.id.editTextRoomWidth);

        setupResultButton();
    }

    private void setupResultButton() {
        buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334", "Result button clicked");   // log button click for debugging using "CIS 3334" tag

                //get length and width
                double length =  Double.parseDouble(editTextRoomLength.getText().toString());
                double width =  Double.parseDouble(editTextRoomWidth.getText().toString());

                //Call Result Activity
                Intent resultsActIntent = new Intent(MainActivity.this, ResultActivity.class);
                //sends over the length and width variables
                resultsActIntent.putExtra("length", length);
                resultsActIntent.putExtra("width", width);
                startActivity(resultsActIntent); //if no result is returned.
            }
        });

    }
    }