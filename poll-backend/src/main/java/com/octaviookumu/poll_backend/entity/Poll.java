package com.octaviookumu.poll_backend.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Poll {
    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options=" + options +
                ", votes=" + votes +
                '}';
    }

    public Poll() {
    }

    public Long getId() {
        return id;
    }

    public Poll(Long id, String question, List<String> options, List<Long> votes) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.votes = votes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Long> getVotes() {
        return votes;
    }

    public void setVotes(List<Long> votes) {
        this.votes = votes;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    // jpa has an annotation that allows creation of a separate table
    // without creating a separate entity
    @ElementCollection // jpa will create a separate table with id and options
    private List<String> options = new ArrayList<>();

    @ElementCollection // jpa will create a separate table with id and options
    private List<Long> votes = new ArrayList<>();
}
