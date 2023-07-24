package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.quiz_app.R;

public class Score_screen extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    TextView congo;
    Button bth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);
        textView = findViewById(R.id.score);
        textView1 = findViewById(R.id.questionNo);
        congo = findViewById(R.id.conngo);
        bth = findViewById(R.id.bTh);


        int score = getIntent().getExtras().getInt("score");
        int ques = getIntent().getExtras().getInt("numOfQuestion");
        textView.setText(""+score);
        textView1.setText(""+ques);
        if(((score*1.0)/ques)>=0.9){
            congo.setText("Excellent!");
        } else if (((score*1.0)/ques)>=0.8) {
            congo.setText("Great!");
        } else if (((score*1.0)/ques)>=0.6) {
            congo.setText("Good!");
        }else {
            congo.setText("Done!");
        }

        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Home_Screen.class);
                finishAffinity();
                startActivity(i);
                finish();
            }
        });
    }
}