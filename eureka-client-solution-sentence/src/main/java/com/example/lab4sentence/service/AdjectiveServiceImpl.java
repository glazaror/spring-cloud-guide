package com.example.lab4sentence.service;

import com.example.lab4sentence.dao.WordDao;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AdjectiveServiceImpl {
    @Autowired
    @Qualifier("adjectiveDao")
    WordDao adjectiveDao;

    @HystrixCommand(fallbackMethod = "getWordDefault")
    public String getWord() {
        return adjectiveDao.getWord();
    }

    public String getWordDefault() {
        return "x";
    }
}
