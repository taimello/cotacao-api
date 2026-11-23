package com.tainaramello.cotacao_api;

import java.util.Map;
import com.tainaramello.cotacao_api.client.AwesomeApiCotacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CotacaoApiApplication {
	public static void main(String[] args) {


		String moeda = "EUR";
		

	AwesomeApiCotacao dolar = new AwesomeApiCotacao("USD", "BRL", "5.659", "5.9782", "2026-11-23 14:35:30");

	Map<String, AwesomeApiCotacao> cotacoes = Map.of("USDBRL", dolar );

	AwesomeApiCotacao resultado = cotacoes.get(moeda + "BRL");
	System.out.println(resultado.bid());

		SpringApplication.run(CotacaoApiApplication.class, args);
	}

}
