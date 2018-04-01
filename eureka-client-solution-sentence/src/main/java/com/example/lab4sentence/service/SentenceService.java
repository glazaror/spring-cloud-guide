package com.example.lab4sentence.service;

import com.example.lab4sentence.dao.NounClient;
import com.example.lab4sentence.dao.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SentenceService {
    @Autowired
    AdjectiveServiceImpl adjectiveService;

    @Autowired
    @Qualifier("articleDao")
    WordDao articleDao;

    /*@Autowired
    @Qualifier("nounDao")
    WordDao nounDao;*/

    @Autowired
    NounClient nounClient;

    @Autowired
    @Qualifier("subjectDao")
    WordDao subjectDao;

    @Autowired
    @Qualifier("verbDao")
    WordDao verbDao;

    public String getSentence() {
        return
                subjectDao.getWord() + " " +
                verbDao.getWord() + " " +
                articleDao.getWord() + " " +
                adjectiveService.getWord() + " " +
                //nounDao.getWord() + ".";
                nounClient.getWord() + "<>.";
    }
}
