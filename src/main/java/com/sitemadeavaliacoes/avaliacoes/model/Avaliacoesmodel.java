package com.sitemadeavaliacoes.avaliacoes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "avaliacoes")
public class Avaliacoesmodel {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String comentario;
    private int nota;
    private LocalDateTime data;
    public Avaliacoesmodel() {
    }

    public Avaliacoesmodel(Long id, String nome, String comentario, int nota, LocalDateTime data) {
        this.id = id;
        this.nome = nome;
        this.comentario = comentario;
        this.nota = nota;
        this.data = data;
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

    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public LocalDateTime getData() {
        return data;
    }
}
