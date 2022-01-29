package com.example.forumapijava.controller;

import com.example.forumapijava.entity.Curso;
import com.example.forumapijava.entity.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class TopicosController{

    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista(){
        Topico topico = new Topico("Duvida", "Duvida Spring", new Curso("Springboot", "Programação"));
        return Arrays.asList(topico, topico, topico);
    }
}