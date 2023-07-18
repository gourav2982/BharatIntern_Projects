package com.example.quiz_app.model;

public class Quiz_start {
    public String heading;
    public int num_of_ques;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getNum_of_ques() {
        return num_of_ques;
    }

    public void setNum_of_ques(int num_of_ques) {
        this.num_of_ques = num_of_ques;
    }

    public Quiz_start(String heading, int num_of_ques) {
        this.heading = heading;
        this.num_of_ques = num_of_ques;
    }
}
