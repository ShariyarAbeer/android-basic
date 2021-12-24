package com.abeer.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView showText,showText2;
    EditText typeView;
    Button clickButton;
    String passValue = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Initialize();

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String typeText = typeView.getText().toString();
                showText.setText(typeText);
            }
        });
    }

    private void Initialize() {
        showText = findViewById(R.id.showText);
        typeView = findViewById(R.id.typeText);
        clickButton = findViewById(R.id.clicked);
        showText2= findViewById(R.id.showText2);
        passValue = getIntent().getStringExtra("IntentValue");
        if(passValue.equals( "EditText")){
            showText.setVisibility(View.GONE);
            typeView.setVisibility(View.GONE);
            clickButton.setVisibility(View.GONE);
            showText2.setVisibility(View.VISIBLE);
        }else {
            showText.setVisibility(View.VISIBLE);
            typeView.setVisibility(View.VISIBLE);
            clickButton.setVisibility(View.VISIBLE);
        }

    }
}