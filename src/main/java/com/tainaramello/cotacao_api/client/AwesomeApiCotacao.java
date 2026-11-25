package com.tainaramello.cotacao_api.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AwesomeApiCotacao(
                String code,
                String codein,
                String bid,
                String ask,
                @JsonProperty("create_date") String createDate) {
}
