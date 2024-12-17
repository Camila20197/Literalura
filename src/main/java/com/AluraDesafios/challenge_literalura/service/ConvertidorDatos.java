package com.AluraDesafios.challenge_literalura.service;

public interface ConvertidorDatos {

    <T> T obtenerDatos(String json, Class<T> clase);

}
