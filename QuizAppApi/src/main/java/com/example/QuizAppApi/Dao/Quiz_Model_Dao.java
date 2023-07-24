package com.example.QuizAppApi.Dao;

import com.example.QuizAppApi.model.Quiz_model;
import com.example.QuizAppApi.model.Quiz_topic;
import com.example.QuizAppApi.repo.Quiz_Model_Repo;
import com.example.QuizAppApi.repo.Quiz_Topic_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class Quiz_Model_Dao {
    @Autowired
    private Quiz_Model_Repo repo;
    @Autowired
    private Quiz_Topic_Dao dao;

    public Quiz_model save(Quiz_model model){
        Quiz_model model1= repo.save(model);
        Quiz_topic topic = dao.getById(model1.getTitleId());
        ArrayList<Integer> arr =topic.getQuestionModelId();
        arr.add(model1.getId());
        int nu =topic.getNumOfQues();
        nu++;
        topic.setNumOfQues(nu);
        topic.setQuestionModelId(arr);
        dao.save(topic);
        return model1;
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
    public Quiz_model getById(int id){
        Optional<Quiz_model> model = repo.findById(id);
        if (model.isPresent()){
            return model.get();
        }
        else{
            throw new RuntimeException("Couldn't find");
        }
    }
}
