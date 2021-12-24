package com.abeer.demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button Button, toastButton,editTextButton,textView,snackBar,progressBar,alertButton,listViewButton,webView;
    ScrollView scrollView;
    RadioButton radioButtonOne,radioButtonTwo;
    RadioGroup radioGroup;
    CheckBox checkBox;
    Switch switchClick;
    Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });

        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });

       final ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.mySpinnerArray, android.R.layout.simple_spinner_dropdown_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = myAdapter.getItem(i).toString();
                Toast.makeText(MainActivity.this,selectedItem,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this,"No Items",Toast.LENGTH_LONG).show();
            }
        });

        switchClick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this,"Switch Clicked",Toast.LENGTH_LONG).show();
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this,"Checked",Toast.LENGTH_LONG).show();

            }
        });

//        radioGroup use korle emon vabe korte hobe
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selected = radioGroup.getCheckedRadioButtonId();
                radioButtonOne = radioGroup.findViewById(selected);
                Toast.makeText(MainActivity.this,"radioButton "+radioButtonOne.getText(),Toast.LENGTH_LONG).show();
            }
        });
//        radioButtonOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                Toast.makeText(MainActivity.this,"radioButton One",Toast.LENGTH_LONG).show();
//            }
//        });
//        radioButtonTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                Toast.makeText(MainActivity.this,"radioButtonTwo",Toast.LENGTH_LONG).show();
//            }
//        });
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Warning")
                        .setCancelable(false)
                        .setMessage("This is a Alert Dialog")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).show();
            }
        });
        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        snackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(scrollView,"This is your Snack Bar",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("IntentValue","EditText");
                startActivity(intent);
            }
        });

        editTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("IntentValue","TextView");
                startActivity(intent);

            }
        });

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button.setText("Mutton");
            }
        });
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Toast",Toast.LENGTH_LONG).show();

            }
        });

    }

    private void Initialize() {
        Button = findViewById(R.id.Button);
        toastButton = findViewById(R.id.toastButton);
        editTextButton = findViewById(R.id.editTextButton);
        textView = findViewById(R.id.textView);
        snackBar = findViewById(R.id.snackBar);
        scrollView = findViewById(R.id.scrollView);
        progressBar = findViewById(R.id.progressBar);
        alertButton = findViewById(R.id.alertButton);
        radioButtonOne= findViewById(R.id.radioButtonOne);
        radioButtonTwo = findViewById(R.id.radioButtonTwo);
        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.checkBox);
        switchClick = findViewById(R.id.switchClick);
        mySpinner = findViewById(R.id.mySpinner);
        listViewButton = findViewById(R.id.listViewButton);
        webView = findViewById(R.id.webView);

    }
}