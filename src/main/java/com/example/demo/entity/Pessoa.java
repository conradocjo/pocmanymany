package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "pessoa")
@Data
@Builder
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pessoa_id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "curso_escolhido",
            joinColumns = @JoinColumn(name = "pessoa_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private List<Curso> cursos;

}
