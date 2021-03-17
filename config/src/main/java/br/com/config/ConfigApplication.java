package br.com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

@EnableConfigServer
@SpringBootApplication
@Profile("default")
public class ConfigApplication implements CommandLineRunner {


    @Value("${spring.cloud.config.server.git.username}")
    private String USERNAME;

    @Value("${spring.cloud.config.server.git.password}")
    private String PASSWORD;

    @Value("${spring.cloud.config.server.git.uri}")
    private String URI;


    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        System.out.println("-------------------------------------------------------------------");
        System.out.println("Valor de USER_NAME " + USERNAME);

        System.out.println("Valor de USER_PASSWORD " + PASSWORD);

        System.out.println("Valor de URI_GITHUB " + URI);

    }

}