package com.example.lab4sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(serviceId = "LAB-4-NOUN")
public interface NounClient {

    @GetMapping("/")
    public String getWord();
}
