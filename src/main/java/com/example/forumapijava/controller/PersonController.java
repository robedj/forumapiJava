package com.example.forumapijava.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/api")
    public String getBook(){
        return "Olá Spring";
    }
}
