package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Objects;

public class Quiz_Screen extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton selectedRadio=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();


        radioGroup = findViewById(R.id.radioGroup);

        //radio button logic
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(selectedRadio!=null){
                    selectedRadio.setElevation(0);
                }

                selectedRadio=findViewById(radioGroup.getCheckedRadioButtonId());
                selectedRadio.setElevation(10);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                    selectedRadio.setOutlineSpotShadowColor(Color.parseColor("#FF3700B3"));
                }
            }
        });
    }
}