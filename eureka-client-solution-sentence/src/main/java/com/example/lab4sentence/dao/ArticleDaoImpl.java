package com.example.lab4sentence.dao;

import org.springframework.stereotype.Component;

@Component("articleDao")
public class ArticleDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return ARTICLE;
    }
}
