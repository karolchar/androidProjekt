package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity4 extends AppCompatActivity {

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView resultBmi = findViewById(R.id.textViewResultBmi2);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String bmi = extras.getString("bmiResult");
        assert bmi != null;
        double bmiDouble = Double.parseDouble(bmi);
        resultBmi.setText(String.format("%.2f", bmiDouble));
    }

}