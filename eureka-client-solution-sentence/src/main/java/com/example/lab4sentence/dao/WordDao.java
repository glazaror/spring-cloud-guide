package com.example.lab4sentence.dao;

public interface WordDao {
    static final String SUBJECT = "eureka-client-subject";
    static final String VERB = "eureka-client-verb";
    static final String ARTICLE = "eureka-client-article";
    static final String ADJECTIVE = "eureka-client-adjective";
    static final String NOUN = "eureka-client-noun";

    String getWord();
}
