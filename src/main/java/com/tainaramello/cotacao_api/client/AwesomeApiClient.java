package com.tainaramello.cotacao_api.client;

import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class AwesomeApiClient {

    private static final String BASE_URL = "https://economia.awesomeapi.com.br";

    private final RestClient restClient;

    public AwesomeApiClient() {
        this.restClient = RestClient.create(BASE_URL);
    }

    public AwesomeApiCotacao buscarCotacao(String moeda) {

        // 1 montar par de moedas
        String par = moeda + "-BRL";

        // 2 chamar a AwesomeAPI e guardar a resposta (map)
        Map<String, AwesomeApiCotacao> resposta = restClient.get()
                .uri("/json/last/{par}", par)
                .retrieve()
                .body(new ParameterizedTypeReference<Map<String, AwesomeApiCotacao>>() {
                });

        // 3 montar a chave do map: ex "USDBRL"
        String chave = moeda + "BRL";

        // 4 buscar no map pela chave e devolver
        return resposta.get(chave);

    }

}
