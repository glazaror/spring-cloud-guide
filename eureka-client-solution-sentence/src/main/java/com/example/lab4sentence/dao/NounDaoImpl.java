package com.example.lab4sentence.dao;

import org.springframework.stereotype.Component;

@Component("nounDao")
public class NounDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return NOUN;
    }
}
