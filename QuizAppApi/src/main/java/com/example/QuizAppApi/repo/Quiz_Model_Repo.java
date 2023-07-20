package com.example.QuizAppApi.repo;

import com.example.QuizAppApi.model.Quiz_model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Quiz_Model_Repo extends CrudRepository<Quiz_model,Integer> {

}
