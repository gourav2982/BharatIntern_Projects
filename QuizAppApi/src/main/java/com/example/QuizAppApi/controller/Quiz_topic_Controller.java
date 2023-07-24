package com.example.QuizAppApi.controller;

import com.example.QuizAppApi.Dao.Quiz_Topic_Dao;
import com.example.QuizAppApi.model.Quiz_topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Quiz_topic_Controller {
    @Autowired
    private Quiz_Topic_Dao topic_dao;


    @GetMapping("/quiz_topic/getAllTopicModel")
    public ArrayList<Quiz_topic> getAllTopicModel(){
        return topic_dao.getAllTopic();
    }

    @PostMapping("/quiz_topic/addTopic")
    public Quiz_topic addTopic(@RequestBody Quiz_topic topic){
        return topic_dao.save(topic);
    }



}
