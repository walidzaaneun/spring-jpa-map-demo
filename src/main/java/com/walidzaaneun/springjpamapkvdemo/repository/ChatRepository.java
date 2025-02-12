package com.walidzaaneun.springjpamapkvdemo.repository;

import com.walidzaaneun.springjpamapkvdemo.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,Long> {
}
