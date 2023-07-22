package com.example.quiz_app.retrofit;

import com.example.quiz_app.ApiModel.Quiz_model;
import com.example.quiz_app.ApiModel.Quiz_topic;

import java.lang.annotation.Target;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface QuizApi {
    @GET("/quiz_topic/getAllTopicModel")
    Call<ArrayList<Quiz_topic>> getAllTopic();

    @GET("/quiz_model/getAll")
    Call<ArrayList<Quiz_model>> getAllModel();
    @GET("/quiz_model/{id}")
    Call<Quiz_model> getModelById(@Path("id") int id);
}
