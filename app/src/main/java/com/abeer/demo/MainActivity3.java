package com.abeer.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity3 extends AppCompatActivity {

    Button clickButton, clickOff;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Initailize();
        clickOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });
    }

    private void Initailize() {
        clickButton = findViewById(R.id.clickButton);
        progressBar = findViewById(R.id.progressBar);
        clickOff = findViewById(R.id.clickOff);
    }
}