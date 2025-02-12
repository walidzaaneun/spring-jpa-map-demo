package com.walidzaaneun.springjpamapkvdemo.util;

import com.walidzaaneun.springjpamapkvdemo.model.Answer;
import com.walidzaaneun.springjpamapkvdemo.model.Chat;
import com.walidzaaneun.springjpamapkvdemo.model.Question;
import com.walidzaaneun.springjpamapkvdemo.repository.AnswerRepository;
import com.walidzaaneun.springjpamapkvdemo.repository.ChatRepository;
import com.walidzaaneun.springjpamapkvdemo.repository.QuestionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Transactional
public class DataInitializer implements ApplicationRunner {

    private final ChatRepository chatRepository;
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public DataInitializer(ChatRepository chatRepository,
                           QuestionRepository questionRepository,
                           AnswerRepository answerRepository) {
        this.chatRepository = chatRepository;
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (chatRepository.count() == 0) {
            // Create and save Questions
            Question q1 = new Question();
            q1.setContent("What is Spring Boot?");
            q1.setTimestamp(LocalDateTime.now());
            q1 = questionRepository.save(q1);

            Question q2 = new Question();
            q2.setContent("How does JPA work?");
            q2.setTimestamp(LocalDateTime.now());
            q2 = questionRepository.save(q2);

            Question q3 = new Question();
            q3.setContent("Explain dependency injection.");
            q3.setTimestamp(LocalDateTime.now());
            q3 = questionRepository.save(q3);

            // Create and save Answers
            Answer a1 = new Answer();
            a1.setContent("Spring Boot is a framework that simplifies Spring application development.");
            a1.setTimestamp(LocalDateTime.now());
            a1 = answerRepository.save(a1);

            Answer a2 = new Answer();
            a2.setContent("JPA is a specification for ORM in Java.");
            a2.setTimestamp(LocalDateTime.now());
            a2 = answerRepository.save(a2);

            Answer a3 = new Answer();
            a3.setContent("Dependency injection is a design pattern where dependencies are provided to objects.");
            a3.setTimestamp(LocalDateTime.now());
            a3 = answerRepository.save(a3);

            // Create Chats with Q&A mappings
            Chat chat1 = new Chat();
            chat1.getQuestionAnswerMap().put(q1, a1);
            chat1.getQuestionAnswerMap().put(q2, a2);
            chatRepository.save(chat1);

            Chat chat2 = new Chat();
            chat2.getQuestionAnswerMap().put(q3, a3);
            chatRepository.save(chat2);
        }
    }
}
