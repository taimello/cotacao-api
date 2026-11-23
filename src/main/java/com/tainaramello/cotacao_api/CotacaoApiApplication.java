package com.tainaramello.cotacao_api;

import com.tainaramello.cotacao_api.dto.CotacaoResponse;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CotacaoApiApplication {

	public static void main(String[] args) {

		
	   CotacaoResponse converte1 = new CotacaoResponse("USD", new BigDecimal("6.50"), new BigDecimal("6.60"), LocalDateTime.now());



    System.out.println("Moeda: " + converte1.moeda());
    System.out.println("Valor de Compra: " + converte1.valorCompra());
    System.out.println("Valor de Venda: " + converte1.valorVenda());
    System.out.println("Data de Atualização: " + converte1.dataAtualizacao());
 
		SpringApplication.run(CotacaoApiApplication.class, args);
	}

}
