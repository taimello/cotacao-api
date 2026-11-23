package com.tainaramello.cotacao_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tainaramello.cotacao_api.dto.CotacaoResponse;
import com.tainaramello.cotacao_api.service.CotacaoService;

@RestController
@RequestMapping("/cotacoes")
public class CotacaoController {

    private final CotacaoService cotacaoService;

    public CotacaoController(CotacaoService cotacaoService){
        this.cotacaoService = cotacaoService;
    }

    
    @GetMapping ("/{moeda}")
    public CotacaoResponse buscarCotacao(@PathVariable String moeda){
        return cotacaoService.buscarCotacao(moeda);
    }
}