package com.abeer.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity4 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Initialize();
        ArrayAdapter<CharSequence> myArrayAdapter = ArrayAdapter.createFromResource(MainActivity4.this,R.array.mySpinnerArray, android.R.layout.simple_list_item_1);
        listView.setAdapter(myArrayAdapter);
    }

    private void Initialize() {
        listView = findViewById(R.id.listView);
    }

}