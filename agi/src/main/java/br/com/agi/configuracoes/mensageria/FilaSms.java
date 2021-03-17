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
public class FilaSms {

    @Value("${spring.rabbitmq.request.exServicos}")
    private String exServicos;

    @Value("${spring.rabbitmq.request.qEnvioSms}")
    private String qEnvioSms;

    @Value("${spring.rabbitmq.request.rkEnvioSms}")
    private String rkEnvioSms;

    @Value("${spring.rabbitmq.request.qdlEnvioSms}")
    private String qdlEnvioSms;

    @Value("${spring.rabbitmq.request.rkdlEnvioSms}")
    private String rkdlEnvioSms;


    @Bean(name = "beanSms")
    DirectExchange exServicos() {
        return new DirectExchange(exServicos);
    }

    @Bean
    Queue qEnvioSms() {
        return QueueBuilder
                //NOME FILA
                .durable(qEnvioSms)
                //NOME EXCHANGE
                .deadLetterExchange(exServicos)
                //NOME FILA
                .deadLetterRoutingKey(qdlEnvioSms)
                .build();
    }

    @Bean
    Queue qdlEnvioSms() {
        return QueueBuilder
                //NOME FILA
                .durable(qdlEnvioSms)
                //NOME EXCHANGE
                .deadLetterExchange(exServicos)
                //NOME FILA
                .deadLetterRoutingKey(qEnvioSms)
                .build();
    }


    @Bean
    Binding bindingFilaDeEnvioDeSms() {
        return BindingBuilder
                //FILA
                .bind(qEnvioSms())
                //EXCHANGE
                .to(exServicos())
                //ROUTING KEY
                .with(rkEnvioSms);
    }

    @Bean
    Binding bindingDeadLetterEnvioDeSms() {
        return BindingBuilder

                //FILA
                .bind(qdlEnvioSms())

                //EXCHANGE
                .to(exServicos())

                //ROUTING KEY
                .with(rkdlEnvioSms);
    }
}
