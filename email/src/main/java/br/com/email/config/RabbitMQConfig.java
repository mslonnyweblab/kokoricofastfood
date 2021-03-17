package br.com.email.config;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {


    @Bean
    public MessageConverter jsonConverter() {
        return new Jackson2JsonMessageConverter();
    }


    @Bean
    @Autowired
    public SimpleRabbitListenerContainerFactory factoryConfigurer
            (
                    ConnectionFactory connectionFactory,
                    SimpleRabbitListenerContainerFactoryConfigurer configurer
            ) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();

        configurer.configure(factory, connectionFactory);
        factory.setMessageConverter(jsonConverter());
        return factory;
    }
}
