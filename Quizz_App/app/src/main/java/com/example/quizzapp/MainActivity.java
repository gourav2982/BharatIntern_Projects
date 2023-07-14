package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizzapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView editText1;
    TextView editText2;
    Spinner spinner1;
    Spinner spinner2;
    Button button1;
    TextView current;
    LinearLayout linearLayout1;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(getResources().getColor(R.color.bg_black));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.bg_black));

        final String[] str1 = {""};
        final String[] str2 = {""};

        linearLayout1 = findViewById(R.id.linearLayout_edit1);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText1.setShowSoftInputOnFocus(false);
        editText2.setShowSoftInputOnFocus(false);

        button1=findViewById(R.id.button1);

        String[] arr = {"Celsius","Fahrenheit","Kelvin"};

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),arr);
        spinner1.setAdapter(customAdapter);
        spinner2.setAdapter(customAdapter);
     editText1.setOnTouchListener((v, event) -> {
         current=editText1;
         return false;
     });

        editText2.setOnTouchListener((v, event) -> {
            current=editText2;
            return false;
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    str1[0] = str1[0] +  ""+ button1.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    str2[0] = str2[0] +  ""+ button1.getText();
                    current.setText(str2[0]);
                }


            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}