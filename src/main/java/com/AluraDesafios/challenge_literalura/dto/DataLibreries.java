package com.AluraDesafios.challenge_literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Esta clase representa una colección de datos de libros.
 *
 * @param books Una lista de objetos DatosBook que representan los libros.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataLibreries(

        @JsonAlias("results") List<DataBook> books

) {
}
