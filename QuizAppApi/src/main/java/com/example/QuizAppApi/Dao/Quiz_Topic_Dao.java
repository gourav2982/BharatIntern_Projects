package com.example.QuizAppApi.Dao;

import com.example.QuizAppApi.model.Quiz_model;
import com.example.QuizAppApi.model.Quiz_topic;
import com.example.QuizAppApi.repo.Quiz_Topic_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;

import java.util.ArrayList;

public class Quiz_Topic_Dao {
    @Autowired
    private Quiz_Topic_Repo repo;

    public void save(Quiz_topic topic){
        repo.save(topic);
    }
    public ArrayList<Quiz_topic> getAllQuizModel(){
        ArrayList<Quiz_topic> quiz_topics = new ArrayList<>();
        //Converts iterable to list
        Streamable.of(repo.findAll()).forEach(quiz_topics::add);
        return quiz_topics;
    }
    public void delete(Quiz_topic topic){
        repo.delete(topic);
    }

}
