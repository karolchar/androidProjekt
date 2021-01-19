package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public void print(View v){

        EditText weight = (EditText) findViewById(R.id.editTextInputWeight);
        EditText height = (EditText) findViewById(R.id.editTextInputHeight);
        TextView bmiResult = (TextView) findViewById(R.id.textViewResultBmi);
        TextView bmiAbout = (TextView) findViewById(R.id.textViewAboutBmi);

        double parsedWeight = Double.parseDouble(weight.getText().toString());
        double parsedheight = Double.parseDouble(height.getText().toString());

        double bmi = countBmi(parsedWeight, parsedheight);

        Bundle extras = new Bundle();
        extras.putString("bmiResult", bmi + "");

        if (bmi >= 18.50 && bmi <= 24.99)
        {
            bmiResult.setText((String.format("%.2f", bmi)));
            bmiAbout.setText("Your BMI result is fine");
        }

        if (bmi <= 18.49)
        {
            Intent intent = new Intent(this, MainActivity3.class);
            intent.putExtras(extras);
            startActivity(intent);
        }

        if (bmi >= 25.00)
        {
            Intent intent = new Intent(this, MainActivity4.class);
            intent.putExtras(extras);
            startActivity(intent);
        }

    }

    double countBmi(double weight, double height){
        return weight / (height * height);
    }

}
