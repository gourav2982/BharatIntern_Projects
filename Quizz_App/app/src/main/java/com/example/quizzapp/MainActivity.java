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

import java.util.Objects;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText editText1;
    EditText editText2;
    Spinner spinner1;
    Spinner spinner2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button11;
    Button allClear;
    Button equals;
    EditText current;
    LinearLayout linearLayout1;
    String[] arr = {"Celsius","Fahrenheit","Kelvin"};
    String spin1 = "";
    String spin2 ="";

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
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button11=findViewById(R.id.button11);
        allClear=findViewById(R.id.button12);
        equals=findViewById(R.id.button10);

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
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button1.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button1.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button2.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button2.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button3.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button3.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button4.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button4.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button5.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button5.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button6.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button6.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button7.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button7.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button8.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button8.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button9.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button9.getText();
                    current.setText(str2[0]);
                }


            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    if(str1[0].length()<6)
                        str1[0] = str1[0] +  ""+ button11.getText();
                    current.setText(str1[0]);
                }else if(current==editText2){
                    if(str2[0].length()<6)
                        str2[0] = str2[0] +  ""+ button11.getText();
                    current.setText(str2[0]);
                }


            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==null){

                }else if(current==editText1){
                    str1[0] = "";
                    current.setText(str1[0]);
                }else if(current==editText2){
                    str2[0] = "";
                    current.setText(str2[0]);
                }


            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(spin1, spin2)){
                    str2[0]=str1[0];
                    editText2.setText(str2[0]);
                }
                if(Objects.equals(spin1, arr[0]) && Objects.equals(spin2, arr[1])){

                    double val= Double.parseDouble(str1[0]);
                    val=((val*9/5)+ 32);
                    val = val * Math.pow(10, 2);
                    val = Math.floor(val);
                    val = val / Math.pow(10, 2);
                    str2[0]=val+"";
                    editText2.setText(str2[0]);
                }
                if(Objects.equals(spin1, arr[0]) && Objects.equals(spin2, arr[2])){

                    double val= Double.parseDouble(str1[0]);
                    val=val + 273.15;
                    val = val * Math.pow(10, 2);
                    val = Math.floor(val);
                    val = val / Math.pow(10, 2);
                    str2[0]=val+"";
                    editText2.setText(str2[0]);
                }
                if(Objects.equals(spin1, arr[1]) && Objects.equals(spin2, arr[0])){

                    double val= Double.parseDouble(str1[0]);
                    val= (val - 32) * 5/9;
                    val = val * Math.pow(10, 2);
                    val = Math.floor(val);
                    val = val / Math.pow(10, 2);
                    str2[0]=val+"";
                    editText2.setText(str2[0]);
                }
                if(Objects.equals(spin1, arr[1]) && Objects.equals(spin2, arr[2])){

                    double val= Double.parseDouble(str1[0]);
                    val=  (val - 32) * 5 / 9 + 273.15;

                    val = val * Math.pow(10, 2);
                    val = Math.floor(val);
                    val = val / Math.pow(10, 2);
                    str2[0]=val+"";
                    editText2.setText(str2[0]);
                    editText2.setText(str2[0]);
                }
                if(Objects.equals(spin1, arr[2]) && Objects.equals(spin2, arr[0])){

                    double val= Double.parseDouble(str1[0]);
                    val=  val- 273.15;

                    val = val * Math.pow(10, 2);
                    val = Math.floor(val);
                    val = val / Math.pow(10, 2);
                    str2[0]=val+"";
                    editText2.setText(str2[0]);
                    editText2.setText(str2[0]);
                }
                if(Objects.equals(spin1, arr[2]) && Objects.equals(spin2, arr[1])){

                    double val= Double.parseDouble(str1[0]);
                    val=  (val - 273.15) * 1.8 + 32;

                    val = val * Math.pow(10, 2);
                    val = Math.floor(val);
                    val = val / Math.pow(10, 2);
                    str2[0]=val+"";
                    editText2.setText(str2[0]);
                    editText2.setText(str2[0]);
                }

            }

        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent==spinner1){
            spin1=arr[position];
        }
        if(parent==spinner2){
            spin2=arr[position];
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}