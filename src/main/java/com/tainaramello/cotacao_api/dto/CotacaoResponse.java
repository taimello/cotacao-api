package com.tainaramello.cotacao_api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CotacaoResponse(
        String moeda,
        BigDecimal valorCompra,
        BigDecimal valorVenda,
        LocalDateTime dataAtualizacao) {
}