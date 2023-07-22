package com.example.QuizAppApi.Dao;

import com.example.QuizAppApi.model.Quiz_model;
import com.example.QuizAppApi.model.Quiz_topic;
import com.example.QuizAppApi.repo.Quiz_Model_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;

import java.util.ArrayList;

public class Quiz_Model_Dao {
    @Autowired
    private Quiz_Model_Repo repo;

    public void save(Quiz_model model){
        repo.save(model);
    }

    public ArrayList<Quiz_model> getAllQuizModel(){
        ArrayList<Quiz_model> quiz_models = new ArrayList<>();
        //Converts iterable to list
        Streamable.of(repo.findAll()).forEach(quiz_models::add);
        return quiz_models;
    }
    public void delete(Quiz_model model){
        repo.delete(model);
    }
}
