package com.AluraDesafios.challenge_literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Esta clase representa los datos de un libro.
 *
 * @param titulo El título del libro.
 * @param autores Una lista de objetos DatosAuthor que representan los autores del libro.
 * @param idiomas Una lista de cadenas de texto que representan los idiomas disponibles del libro.
 * @param descargas El número de descargas del libro.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBook(

        @JsonAlias("title")  String titulo,

        @JsonAlias("authors")  List<DataAuthor> autores,

        @JsonAlias("languages") List<String> idiomas,

        @JsonAlias("download_count") Integer descargas

){
}
