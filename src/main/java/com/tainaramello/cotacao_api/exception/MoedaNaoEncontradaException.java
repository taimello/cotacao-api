package com.tainaramello.cotacao_api.exception;

public class MoedaNaoEncontradaException extends RuntimeException {

    public MoedaNaoEncontradaException(String moeda) {
        super("A moeda: " + moeda + " não foi encontrada");
    }
    
}
