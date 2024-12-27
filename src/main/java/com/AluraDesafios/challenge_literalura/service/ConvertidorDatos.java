package com.AluraDesafios.challenge_literalura.service;

/**
 * Define un contrato para convertir un JSON en un objeto de una clase específica. Esta
 * interfaz permite desacoplar la lógica de consumo de la API de la lógica de mapeo de datos.
 * */
public interface ConvertidorDatos {

    /**
     * Convierte un JSON en un objeto de la clase especificada.
     *
     * @param json La cadena JSON a convertir.
     * @param clase La clase de destino del objeto.
     * @param <T> El tipo genérico de la clase de destino.
     * @return El objeto creado a partir del JSON.
     * @throws RuntimeException Si ocurre un error durante la conversión.
     */
    <T> T obtenerDatos(String json, Class<T> clase);

}
