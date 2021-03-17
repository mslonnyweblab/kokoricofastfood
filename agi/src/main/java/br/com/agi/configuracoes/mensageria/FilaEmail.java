package br.com.agi.configuracoes.mensageria;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* As filas tem um papel fundamental no sistema. As ações principais tentarão comunicação via HTTP diretamente para o
* micro-serviço, em caso de falha as filas entrarão em ação.
* */
@Configuration
public class FilaEmail {

    @Value("${spring.rabbitmq.request.exEssenciais}")
    private String exEssenciais;

    @Value("${spring.rabbitmq.request.qEnvioEmail}")
    private String qEnvioEmail;

    @Value("${spring.rabbitmq.request.rkEnvioEmail}")
    private String rkEnvioEmail;

    @Value("${spring.rabbitmq.request.qdlEnvioEmail}")
    private String qdlEnvioEmail;

    @Value("${spring.rabbitmq.request.rkdlEnvioEmail}")
    private String rkdlEnvioEmail;


    @Bean(name = "beanEmail")
    DirectExchange exEssenciais() {
        return new DirectExchange(exEssenciais);
    }

    @Bean
    Queue qEnvioDeEmail() {
        return QueueBuilder
                //NOME FILA
                .durable(qEnvioEmail)
                //NOME EXCHANGE
                .deadLetterExchange(exEssenciais)
                //NOME FILA
                .deadLetterRoutingKey(rkdlEnvioEmail)
                .build();
    }

    @Bean
    Queue qdlEnvioEmail() {
        return QueueBuilder
                //NOME FILA
                .durable(qdlEnvioEmail)
                //NOME EXCHANGE
                .deadLetterExchange(exEssenciais)
                //NOME FILA
                .deadLetterRoutingKey(qEnvioEmail)
                .build();
    }


    @Bean
    Binding bindingFilaDeEnvioDeEmails() {
        return BindingBuilder
                //FILA
                .bind(qEnvioDeEmail())
                //EXCHANGE
                .to(exEssenciais())
                //ROUTING KEY
                .with(rkEnvioEmail);
    }

    @Bean
    Binding bindingDeadLetterEnvioDeEmails() {
        return BindingBuilder

                .bind(qdlEnvioEmail())

                //EXCHANGE
                .to(exEssenciais())

                //ROUTING KEY
                .with(rkdlEnvioEmail);
    }

}
