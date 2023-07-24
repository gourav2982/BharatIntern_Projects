package com.example.QuizAppApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Quiz_model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public   int titleId;
    private String question;
    private  String options1;
    private  String options2;
    private  String options3;
    private  String options4;
    private String correct_option;
}
