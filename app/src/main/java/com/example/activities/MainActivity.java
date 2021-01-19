package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.buttonCalculateBmi);
        button1.setOnClickListener(newActivityListener);
    }


    private View.OnClickListener newActivityListener = new
            View.OnClickListener() {
                public void onClick(View v) {
                    startActivity();
                }
            };

    private void startActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}