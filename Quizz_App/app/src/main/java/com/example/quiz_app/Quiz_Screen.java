package com.example.quiz_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quiz_app.ApiModel.Quiz_model;
import com.example.quiz_app.ApiModel.Quiz_topic;
import com.example.quiz_app.retrofit.QuizApi;
import com.example.quiz_app.retrofit.RetrofitServices;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Quiz_Screen extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton selectedRadio=null;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;
    TextView ques;
    TextView title;
    MaterialButton nextBtn;
    RetrofitServices retrofitServices = new RetrofitServices();
    QuizApi quizApi = retrofitServices.getRetrofit().create(QuizApi.class);
    ArrayList<Integer> questionId ;
    Context context =this;
    String title1 ;
    TextView textView;
    ImageButton back;
    int count=0;
    int score=0;
    String correct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();


        radioGroup = findViewById(R.id.radioGroup);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);
        ques = findViewById(R.id.textView3);
        title = findViewById(R.id.textView);
        nextBtn = findViewById(R.id.nextBtn);
        textView=findViewById(R.id.textView2);
        back= findViewById(R.id.backBtn);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Home_Screen.class);
                finishAffinity();
                startActivity(i);
                finish();
            }
        });

        questionId= getIntent().getExtras().getIntegerArrayList("questionId");
        title1=getIntent().getExtras().getString("title");
        nextQuestion();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<questionId.size()&&selectedRadio!=null){
                    nextQuestion();
                    if((selectedRadio.getText() + "").equals(correct)){
                        score++;
                    }

                }
                else if(count>=questionId.size()){
                    if((selectedRadio.getText() + "").equals(correct)){
                        score++;
                    }
                    Intent i=new Intent(context, Score_screen.class);
                    i.putExtra("score",score);
                    i.putExtra("numOfQuestion",questionId.size());
                    context.startActivity(i);
                    finish();

                }
            }
        });




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

    public void nextQuestion(){

        quizApi.getModelById(questionId.get(count)).enqueue(new Callback<Quiz_model>() {
            @Override
            public void onResponse(@NonNull Call<Quiz_model> call, @NonNull Response<Quiz_model> response) {

                if(response.body()!=null){
                    Quiz_model model = response.body();
                    textView.setText("Question "+(count+1)+"/"+questionId.size());
                    radio1.setText(model.getOptions1());
                    radio2.setText(model.getOptions2());
                    radio3.setText(model.getOptions3());
                    radio4.setText(model.getOptions4());
                    ques.setText(model.getQuestion());
                    correct = model.getCorrect_option()+"";
                    title.setText(title1);

                    count++;


                }


            }

            @Override
            public void onFailure(Call<Quiz_model> call, Throwable t) {

            }
        });
    }
}