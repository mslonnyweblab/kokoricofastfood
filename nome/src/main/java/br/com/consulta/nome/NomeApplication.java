package br.com.consulta.nome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/*
* MICRO-SERVIÇO EXCLUSIVO PARA CONSULTA DE NOME. EX: RECEITA FEDERAL.
* */
@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class NomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NomeApplication.class, args);
	}


}