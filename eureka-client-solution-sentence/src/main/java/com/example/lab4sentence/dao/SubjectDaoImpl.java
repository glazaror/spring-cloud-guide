package com.example.lab4sentence.dao;

import org.springframework.stereotype.Component;

@Component("subjectDao")
public class SubjectDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return SUBJECT;
    }
}
