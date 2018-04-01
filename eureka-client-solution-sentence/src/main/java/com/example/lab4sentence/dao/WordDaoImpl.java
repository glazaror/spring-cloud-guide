package com.example.lab4sentence.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public abstract class WordDaoImpl implements WordDao {
    @Autowired
    RestTemplate restTemplate;

    public abstract String getPartOfSpeech();

    public String getWord() {
        return restTemplate.getForObject("http://" + getPartOfSpeech(), String.class);
    }
}
