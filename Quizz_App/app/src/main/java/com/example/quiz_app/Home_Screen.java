package com.example.quiz_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.quiz_app.ApiModel.Quiz_topic;
import com.example.quiz_app.adapter.Selection_Adapter;
import com.example.quiz_app.model.Quiz_start;
import com.example.quiz_app.retrofit.QuizApi;
import com.example.quiz_app.retrofit.RetrofitServices;

import java.util.ArrayList;
import java.util.Objects;

import kotlin.jvm.Synchronized;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home_Screen extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Quiz_start> qs = new ArrayList<>();
    ArrayList<Integer> questionId;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Quiz app");


        RetrofitServices retrofitServices = new RetrofitServices();
        QuizApi quizApi = retrofitServices.getRetrofit().create(QuizApi.class);

         quizApi.getAllTopic()
                .enqueue(new Callback<ArrayList<Quiz_topic>>() {
                    @Override
                    public void onResponse(@NonNull Call<ArrayList<Quiz_topic>> call, @NonNull Response<ArrayList<Quiz_topic>> response) {
                        ArrayList<Quiz_topic> qt = response.body();


                        for(int i = 0; i< Objects.requireNonNull(response.body()).size(); i++){
                            assert qt != null;
                            Quiz_start topic = new Quiz_start(qt.get(i).getTitle(),qt.get(i).getNumOfQues());
                            questionId = qt.get(i).getQuestionModelId();
                            qs.add(topic);
                        }


                        Selection_Adapter sa = new Selection_Adapter(qs,questionId,context);
                        recyclerView = findViewById(R.id.Quiz_selection_recycler_view);
                        recyclerView.setLayoutManager(new LinearLayoutManager(context));
                        recyclerView.setAdapter(sa);
                    }

                    @Override
                    public void onFailure(Call<ArrayList<Quiz_topic>> call, Throwable t) {

                    }

                });

    }
}