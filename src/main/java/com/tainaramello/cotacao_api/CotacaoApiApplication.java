package com.tainaramello.cotacao_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tainaramello.cotacao_api.service.CotacaoService;

@SpringBootApplication
public class CotacaoApiApplication {

	public static void main(String[] args) {

		CotacaoService service = new CotacaoService();
		System.out.println(service.buscarCotacao("EUR"));
		
		SpringApplication.run(CotacaoApiApplication.class, args);
	}

}
