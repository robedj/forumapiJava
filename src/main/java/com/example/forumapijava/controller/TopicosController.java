package com.example.forumapijava.controller;


import java.util.Arrays;
import java.util.List;
import com.example.forumapijava.controller.dto.TopicoDto;
import com.example.forumapijava.entity.Curso;
import com.example.forumapijava.entity.Topico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/topicos") //endereco mapeado
@RestController
public class TopicosController {

    @GetMapping
    public List<TopicoDto> list() {

        Topico topico = new Topico("Dúvida","Dúvida com Spring",new Curso("Spring","Programação"));

        return TopicoDto.converter(Arrays.asList(topico,topico,topico));

    }

}