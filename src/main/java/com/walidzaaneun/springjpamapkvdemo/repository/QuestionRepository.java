package com.walidzaaneun.springjpamapkvdemo.repository;

import com.walidzaaneun.springjpamapkvdemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
