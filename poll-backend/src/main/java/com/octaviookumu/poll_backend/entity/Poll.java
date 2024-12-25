package com.octaviookumu.poll_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "question")
    private String question;

    // jpa has an annotation that allows creation of a separate table
    // without creating a separate entity
    @ElementCollection // jpa will create a separate table with id and options
    private List<String> options = new ArrayList<>();

    @ElementCollection // jpa will create a separate table with id and options
    private List<Long> votes = new ArrayList<>();
}
