package com.example.forumapijava.repository;

import com.example.forumapijava.entity.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository <Topico, Long>{


    List<Topico> findByCursoNome(String nomeCurso);
}
