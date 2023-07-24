package com.example.QuizAppApi.controller;

import com.example.QuizAppApi.Dao.Quiz_Model_Dao;
import com.example.QuizAppApi.Dao.Quiz_Topic_Dao;
import com.example.QuizAppApi.model.Quiz_model;
import com.example.QuizAppApi.model.Quiz_topic;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Quiz_model_Controller {
    @Autowired
    private Quiz_Model_Dao model_dao;
    @Autowired
    private Quiz_Topic_Dao controller;

    @GetMapping("/quiz_model/getAll")
    public ArrayList<Quiz_model> getAllQuizModel(){
        return model_dao.getAllQuizModel();
    }
    @PostMapping("/quiz_Model/AddQuiz")
    public Quiz_model addQuiz(@RequestBody  Quiz_model model){

        return model_dao.save(model);

    }
    @GetMapping("/quiz_model/{id}")
    public Quiz_model getModelById(@PathVariable int id) {
        return model_dao.getById(id);
    }
}
