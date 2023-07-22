package com.example.QuizAppApi.controller;

import com.example.QuizAppApi.Dao.Quiz_Model_Dao;
import com.example.QuizAppApi.model.Quiz_model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Quiz_model_Controller {
    @Autowired
    Quiz_Model_Dao model_dao;

    @GetMapping("/quiz_model/getAll")
    public ArrayList<Quiz_model> getAllQuizModel(){
        return model_dao.getAllQuizModel();
    }
    @PostMapping("/quiz_topic/AddQuiz")
    public void addQuiz(Quiz_model model){
        model_dao.save(model);
    }
}
