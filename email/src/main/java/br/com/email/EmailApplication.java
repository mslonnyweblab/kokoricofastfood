package br.com.email;

import br.com.email.implementation.JavaMailImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class EmailApplication {

    @Autowired
    private JavaMailImplementation envioDeFato;

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);

    }
}