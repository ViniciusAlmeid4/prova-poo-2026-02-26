package com.studentsList.student.models;

import com.studentsList.student.enums.EstudanteEnum;
import jakarta.persistence.*;

@Table(name = "tb_aluno")
@Entity
public class Estudante {
    @Column(name = "identificador")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "come_completo")
    private String nome;
    private String email;
    private Integer idade;
    private EstudanteEnum status;

    public Estudante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public EstudanteEnum getStatus() {
        return status;
    }

    public void setStatus(EstudanteEnum status) {
        this.status = status;
    }
}
