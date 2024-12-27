package com.AluraDesafios.challenge_literalura.model;

import java.util.Arrays;

/**
 * Esta clase enumera los posibles idiomas de un libro.
 */
public enum Language {
    SPANISH("es"),

    ENGLISH("en"),

    FRENCH("fr"),

    PORTUGUESE("pt");

    private final String idioma;

    Language(String idioma) {
        this.idioma = idioma;
    }

    public static Language fromString(String text) {
        return Arrays.stream(values())
                .filter(lang -> lang.idioma.equalsIgnoreCase(text))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Idioma no válido: " + text));
    }
}
