package br.com.agi.configuracoes.mensageria;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/*
 * Classe que representa as configurações base do RabbitMQ.
 *
 * */
@Configuration
public class RabbitMqConfig {

    /*
     * Representa a conexão com o RabbitMQ
     * */
    @Autowired
    private ConnectionFactory connectionFactory;

    /*
     * Recebe uma conexão e um conversor de mensagens.
     * */
    @Bean
    public SimpleRabbitListenerContainerFactory factory() {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(jsonMessageConverter());
        return factory;
    }

    /*
     * Recebe conexão e um conversor de mensagens.
     * */
    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }


    /*
     * Padrão de conversão de mensagens
     * */
    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter() {
        ObjectMapper mapper = Jackson2ObjectMapperBuilder
                .json()
                .modules(new JavaTimeModule())
                .dateFormat(new StdDateFormat())
                .build();
        return new Jackson2JsonMessageConverter(mapper);
    }

}