package com.walidzaaneun.springjpamapkvdemo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Chat extends AbstractSuperClass{

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chat_qa_mapping",
            joinColumns = @JoinColumn(name = "chat_id"))
    @MapKeyJoinColumn(name = "question_id")
    private Map<Question, Answer> questionAnswerMap = new HashMap<>();

}
