package com.example.quiz_app.ApiModel;



import java.util.ArrayList;


public class Quiz_topic {

    private int id;
    private String title;
    private ArrayList<Integer> questionModelId;
    private int numOfQues;

    public int getNumOfQues() {
        return numOfQues;
    }

    public void setNumOfQues(int numOfQues) {
        this.numOfQues = numOfQues;
    }

    public Quiz_topic(String title, ArrayList<Integer> questionModelId) {
        this.title = title;
        this.questionModelId = questionModelId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Integer> getQuestionModelId() {
        return questionModelId;
    }

    public void setQuestionModelId(ArrayList<Integer> questionModelId) {
        this.questionModelId = questionModelId;
    }
}
