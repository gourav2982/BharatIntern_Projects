package com.example.quiz_app.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServices {
    private Retrofit retrofit;
    public RetrofitServices(){
        initializeRetrofit();
    }
    private void initializeRetrofit(){
        retrofit = new Retrofit.Builder().
                baseUrl("http://192.168.95.250:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }
    public Retrofit getRetrofit(){
        return retrofit;
    }
}
