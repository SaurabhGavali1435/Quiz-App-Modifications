package com.example.quiz.service;

import com.example.quiz.entity.Question;
import com.example.quiz.Repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository repo;

    public List<Question> saveAllQuestions(List<Question> questions) {
        return repo.saveAll(questions);
    }

    public List<Question> getQuestionsBySubject(String subject) {
        return repo.findRandomQuestionsBySubject(subject);
    }
}
