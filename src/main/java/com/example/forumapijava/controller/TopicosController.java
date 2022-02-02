package com.example.forumapijava.controller;

import java.util.List;
import com.example.forumapijava.controller.dto.TopicoDto;
import com.example.forumapijava.entity.Topico;
import com.example.forumapijava.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping(value = "/topicos", method = RequestMethod.GET)
        public List<TopicoDto> lista(String nomeCurso) { //metodo pra listar
        System.out.println(nomeCurso);
        if (nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDto.converter(topicos);
        }else{
            List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
            return TopicoDto.converter(topicos);
        }
    }
    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public void cadastrar(){

    }
}