package com.AluraDesafios.challenge_literalura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *  Esta clase se encarga de consumir una API externa (en este caso, la API de Gutenberg)
 *  para obtener datos en formato JSON.
 *  */
public class ConsumoAPI {

    /**
     * Realiza una solicitud HTTP GET a la URL especificada y
     * devuelve la respuesta en formato JSON.
     *
     * @param url La URL a la que se realizará la solicitud.
     * @return La respuesta de la solicitud en formato JSON.
     * @throws RuntimeException Si ocurre un error durante la solicitud HTTP.
     */
    public String obtenerDatos(String url){

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String json = response.body();
        return json;
    }
}