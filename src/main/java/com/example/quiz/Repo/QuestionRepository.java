package com.example.quiz.Repo;

import com.example.quiz.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM questions WHERE subject = :subject ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<Question> findRandomQuestionsBySubject(String subject);

}
