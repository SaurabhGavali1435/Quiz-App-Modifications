package com.example.quiz.controller;

import com.example.quiz.entity.Question;
import com.example.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService service;

    @PostMapping("/saveAll")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Question> saveQuestions(@RequestBody List<Question> questions) {
        return service.saveAllQuestions(questions);
    }

    @GetMapping("/{subject}")
    public List<Question> getQuestionsBySubject(@PathVariable String subject) {
        return service.getQuestionsBySubject(subject);
    }
}
