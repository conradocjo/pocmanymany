package com.example.demo.controller;

import com.example.demo.entity.Curso;
import com.example.demo.entity.Pessoa;
import com.example.demo.repository.CursoRepository;
import com.example.demo.repository.PessoaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/cadastro")
public class Controller {


    private final PessoaRepository pessoaRepository;

    private final CursoRepository cursoRepository;

    public Controller(PessoaRepository pessoaRepository, CursoRepository cursoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.cursoRepository = cursoRepository;
    }

    @GetMapping("/pessoa")
    public ResponseEntity<String> novaPessoa() {


        var curso = Curso.builder()
                .nome("Sistema de informação")
                .build();

        var curso2 = Curso.builder()
                .nome("Engenharia de dados")
                .build();

        cursoRepository.saveAll(Arrays.asList(curso, curso2));

        var cursos = cursoRepository.findAll();

        var pessoa = Pessoa.builder()
                .nome("Carimbo")
                .cursos(cursos)
                .build();

        var pessoa2 = Pessoa.builder()
                .nome("Carlos")
                .cursos(cursos)
                .build();

        curso.setPessoas(Arrays.asList(pessoa, pessoa2));
        pessoaRepository.saveAll(Arrays.asList(pessoa, pessoa2));
        return ResponseEntity.ok("ok");
    }


}
