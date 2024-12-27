package com.AluraDesafios.challenge_literalura.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  Implementa la interfaz ConvertidorDatos y utiliza la librería Jackson para convertir
 *  un JSON en un objeto Java.
 * */
public class ConvertirDatos {

    ObjectMapper objectMapper = new ObjectMapper().enable(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);

    /**
     * Convierte un JSON en un objeto de la clase especificada utilizando
     * la librería Jackson.
     *
     * @param json La cadena JSON a convertir.
     * @param clase La clase de destino del objeto.
     * @param <T> El tipo genérico de la clase de destino.
     * @return El objeto creado a partir del JSON.
     * @throws RuntimeException Si ocurre un error durante la conversión.
     */
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
