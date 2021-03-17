package br.com.agi;

import br.com.agi.configuracoes.ConfigsAsterisk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AgiApplication implements CommandLineRunner {

    @Autowired
    private ConfigsAsterisk configsAsterisk;

    public static void main(String[] args) {
        try {
            SpringApplication.run(AgiApplication.class, args);
        } catch (Exception e) {
            System.out.println("-------------------------------" + e.getMessage() + "------------");
        }
    }

    @Override
    public void run(String... args) throws Exception {
        configsAsterisk.startServer();
    }
}