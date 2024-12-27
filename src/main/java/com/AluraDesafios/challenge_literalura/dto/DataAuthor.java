package com.AluraDesafios.challenge_literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Esta clase representa los datos de un autor.
 *
 * @param nombre El nombre del autor.
 * @param anioNacimiento El año de nacimiento del autor.
 * @param anioMuerte El año de muerte del autor.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataAuthor(

        @JsonAlias("name") String nombre,

        @JsonAlias("birth_year") int anioNacimiento,

        @JsonAlias("death_year") int anioMuerte
){

}

