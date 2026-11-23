package com.tainaramello.cotacao_api.service;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.tainaramello.cotacao_api.dto.CotacaoResponse;

@Service 
public class CotacaoService {

    public CotacaoResponse buscarCotacao(String moeda){
        return  new CotacaoResponse(moeda, new BigDecimal("5.00"), new BigDecimal("7.30"), LocalDateTime.now());
    }

}