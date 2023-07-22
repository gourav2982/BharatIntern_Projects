package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quiz_app.R;

public class Score_screen extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);
        textView = findViewById(R.id.score);
        textView1 = findViewById(R.id.questionNo);

        int score = getIntent().getExtras().getInt("score");
        int ques = getIntent().getExtras().getInt("numOfQuestion");
        textView.setText(""+score);
        textView1.setText(""+ques);
    }
}