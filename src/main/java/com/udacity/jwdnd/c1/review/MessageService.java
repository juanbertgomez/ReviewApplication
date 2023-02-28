package com.udacity.jwdnd.c1.review;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.PostExchange;

@Service
public class MessageService {

    private String message;

    public MessageService(String message) {
        this.message = message;
    }

    public  String uppercase(){
        return this.message.toUpperCase();
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

//    @PostConstruct
//    pubic void postConstruction() {
//        System.out.println("Creating MessageService bean");
//    }
}
