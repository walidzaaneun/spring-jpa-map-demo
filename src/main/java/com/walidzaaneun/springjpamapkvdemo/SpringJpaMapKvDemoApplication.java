package com.walidzaaneun.springjpamapkvdemo;

import com.walidzaaneun.springjpamapkvdemo.model.Answer;
import com.walidzaaneun.springjpamapkvdemo.model.Chat;
import com.walidzaaneun.springjpamapkvdemo.model.Question;
import com.walidzaaneun.springjpamapkvdemo.repository.AnswerRepository;
import com.walidzaaneun.springjpamapkvdemo.repository.ChatRepository;
import com.walidzaaneun.springjpamapkvdemo.repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableJpaAuditing
public class SpringJpaMapKvDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaMapKvDemoApplication.class, args);
    }

}
