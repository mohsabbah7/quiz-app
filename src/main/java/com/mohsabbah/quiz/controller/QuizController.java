package com.mohsabbah.quiz.controller;


import org.springframework.ui.Model;
import com.mohsabbah.quiz.model.Question;
import com.mohsabbah.quiz.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuizController {

    private final QuestionService questionService;

    public QuizController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/quiz")
    public String getQuiz(Model model){
        List<Question> questions = questionService.getQuestions();
        model.addAttribute("questions", questions);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String submitQuiz(@RequestParam java.util.Map<String, String> answers, Model model){
        List<Question> questions = questionService.getQuestions();
        int score = 0;
        for (int i = 0; i < questions.size(); i++){
            String answer = answers.get("q" + i);
            if(questions.get(i).getCorrectAnswer().equals(answer)){
                score++;
            }
        }
        model.addAttribute("score", score);
        model.addAttribute("total", questions.size());
        return "result";
    }
}
