package com.AluraDesafios.challenge_literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosBook (

        int id,

        @JsonAlias("title")  String titulo,

        @JsonAlias("authors")  List<Author> autores,

        @JsonAlias("subjects") List<String> temas
){
}
