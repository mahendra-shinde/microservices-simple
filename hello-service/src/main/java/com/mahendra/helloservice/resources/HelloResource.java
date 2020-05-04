package com.mahendra.helloservice.resources;

import java.util.Date;

import com.mahendra.helloservice.models.Message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {

    @GetMapping
    public Message sayHello(){
        return new Message("Hello from Service", new Date());
    }
    
}