package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "curso")
@Data
@Builder
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "curso_id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @ManyToMany(mappedBy = "cursos")
    private List<Pessoa> pessoas;

}
