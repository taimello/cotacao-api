package com.tainaramello.cotacao_api.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.tainaramello.cotacao_api.client.AwesomeApiClient;
import com.tainaramello.cotacao_api.client.AwesomeApiCotacao;
import com.tainaramello.cotacao_api.dto.CotacaoResponse;

@Service
public class CotacaoService {

    private static final DateTimeFormatter FORMATO_DATA_AWESOMEAPI = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final AwesomeApiClient awesomeApiClient;

    public CotacaoService(AwesomeApiClient awesomeApiClient) {
        this.awesomeApiClient = awesomeApiClient;

    }

    public CotacaoResponse buscarCotacao(String moeda) {

        AwesomeApiCotacao cotacaoExterna = awesomeApiClient.buscarCotacao(moeda);
        return new CotacaoResponse(cotacaoExterna.code(),
                new BigDecimal(cotacaoExterna.bid()),
                new BigDecimal(cotacaoExterna.ask()),
                LocalDateTime.parse(cotacaoExterna.createDate(), FORMATO_DATA_AWESOMEAPI));
    }

}