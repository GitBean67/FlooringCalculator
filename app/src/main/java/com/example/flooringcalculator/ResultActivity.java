package com.example.flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textViewFlooringNeeded;
    TextView texViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //retrieve extra variables
        Intent resultsActIntent = getIntent();
        double length = resultsActIntent.getDoubleExtra("length", 0);
        double width = resultsActIntent.getDoubleExtra("width", 0);

        textViewFlooringNeeded = findViewById(R.id.textViewFlooringNeeded);
        texViewResult = findViewById(R.id.textViewResult);

        //calculate flooring needed
        double flooringNeeded = length * width;

        //display results
        texViewResult.setText("Width is " + width + " and length is " + length + ". Flooring needed is " + flooringNeeded + ".");
    }
}