package com.mohsabbah.quiz.model;

import java.util.List;

public class Question {

    private String questionText;
    private List<String> options;
    private String correctAnswer;

    public Question(String questionText, List<String> options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {return correctAnswer;}
    public List<String> getOptions() {return options;}
    public String getQuestionText() {return questionText;}

    public void setCorrectAnswer(String correctAnswer) {this.correctAnswer = correctAnswer;}
    public void setOptions(List<String> options) {this.options = options;}
    public void setQuestionText(String questionText) {this.questionText = questionText;}
}
