package com.example.QuizAppApi.Dao;

import com.example.QuizAppApi.model.Quiz_model;
import com.example.QuizAppApi.model.Quiz_topic;
import com.example.QuizAppApi.repo.Quiz_Topic_Repo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class Quiz_Topic_Dao {
    @Autowired
    private Quiz_Topic_Repo repo;

    public Quiz_topic save(Quiz_topic topic){
        return repo.save(topic);
    }
    public ArrayList<Quiz_topic> getAllTopic(){
        ArrayList<Quiz_topic> quiz_topics = new ArrayList<>();
        //Converts iterable to list
        Streamable.of(repo.findAll()).forEach(quiz_topics::add);
        return quiz_topics;
    }
    public void delete(Quiz_topic topic){
        repo.delete(topic);
    }

    public Quiz_topic getById(int id){
        Optional<Quiz_topic> model = repo.findById(id);
        if (model.isPresent()){
            return model.get();
        }
        else{
            throw new RuntimeException("Couldn't find");
        }
    }

}
