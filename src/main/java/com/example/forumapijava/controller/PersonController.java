package com.example.forumapijava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {

    @RequestMapping("/api")
    @ResponseBody
    public String getBook(){
        return "Olá Spring";
    }
}
