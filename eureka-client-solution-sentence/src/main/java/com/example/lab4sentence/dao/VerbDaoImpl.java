package com.example.lab4sentence.dao;

import org.springframework.stereotype.Component;

@Component("verbDao")
public class VerbDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return VERB;
    }
}
