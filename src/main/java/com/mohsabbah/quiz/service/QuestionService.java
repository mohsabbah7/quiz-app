package com.mohsabbah.quiz.service;

import com.mohsabbah.quiz.model.Question;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;

@Service
public class QuestionService {

    private final List<Question> questions = Arrays.asList(
            new Question("What is the capital of Jordan?", Arrays.asList("Amman", "Dubai", "Cairo", "Baghdad"),"Amman"),
            new Question("What is 2 + 2?", Arrays.asList("3", "4", "5", "60"), "4"),
            new Question("Which language is used in Spring Boot", Arrays.asList("Python", "Java", "C++", "Ruby"), "Java")
    );

    public List<Question> getQuestions() {
        return questions;
    }
}
