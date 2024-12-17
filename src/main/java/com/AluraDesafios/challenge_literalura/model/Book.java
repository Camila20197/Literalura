package com.AluraDesafios.challenge_literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Book {

    private int id;

    private String titulo;

    private List<Author> autores;

    private List<String> temas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Author> getAutores() {
        return autores;
    }

    public void setAutores(List<Author> autores) {
        this.autores = autores;
    }

    public List<String> getTemas() {
        return temas;
    }

    public void setTemas(List<String> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autores=" + autores +
                ", temas=" + temas +
                '}';
    }
}
