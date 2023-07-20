package com.example.QuizAppApi.repo;

import com.example.QuizAppApi.model.Quiz_topic;
import org.springframework.data.repository.CrudRepository;

public interface Quiz_Topic_Repo extends CrudRepository<Quiz_topic,Integer> {
}
