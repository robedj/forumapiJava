package com.example.forumapijava.controller;

import com.example.forumapijava.entity.Curso;
import com.example.forumapijava.entity.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
//primeiro ENDPOINT
@Controller
public class TopicosController {

    @ResponseBody
    @RequestMapping("/topicos")
    public List<Topico> lista(){
        Topico topic = new Topico("duvida", "duvida com spring", new Curso("Springboot", "programacao"));
        return Arrays.asList(topic, topic, topic);
    }


}
