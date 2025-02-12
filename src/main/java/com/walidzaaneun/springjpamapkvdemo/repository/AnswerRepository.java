package com.walidzaaneun.springjpamapkvdemo.repository;

import com.walidzaaneun.springjpamapkvdemo.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
