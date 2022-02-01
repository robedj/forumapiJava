package com.example.forumapijava.repository;

import com.example.forumapijava.entity.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository <Topico, Long>{


    List<Topico> findByCurso_Nome(String nomeCurso);


    @Query("SELECT t FROM Topico T WHERE t.curso.nome = :nomeCurso")
    List<Topico> loadPorNomeDoCurso(@Param("nomeCurso")String nomeCurso);
}
