package com.example.lab4sentence.dao;

import org.springframework.stereotype.Component;

@Component("adjectiveDao")
public class AdjectiveDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return ADJECTIVE;
    }
}
