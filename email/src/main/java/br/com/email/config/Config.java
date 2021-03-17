package br.com.email.config;

import br.com.email.implementation.JavaMailImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public JavaMailImplementation serviceEmail() {
        return new JavaMailImplementation();
    }

}