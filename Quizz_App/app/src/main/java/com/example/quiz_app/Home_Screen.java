package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quiz_app.adapter.Selection_Adapter;
import com.example.quiz_app.model.Quiz_start;

import java.util.ArrayList;
import java.util.Objects;

public class Home_Screen extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Quiz_start> qs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Quiz app");
        qs.add(new Quiz_start("Geography of Mars",20));
        qs.add(new Quiz_start("Geography of Venus",10));
        qs.add(new Quiz_start("Geography of Earth",30));
        Selection_Adapter sa = new Selection_Adapter(qs);
        recyclerView = findViewById(R.id.Quiz_selection_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sa);
    }
}