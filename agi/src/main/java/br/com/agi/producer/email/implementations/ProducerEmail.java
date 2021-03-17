package br.com.agi.producer.email.implementations;

import br.com.agi.producer.ProducerTempl;
import br.com.agi.producer.interfaces.Dto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerEmail extends ProducerTempl {

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

    @Autowired
    private RabbitTemplate template;


    @Override
    protected void convertSend(Dto dto) {
        template.convertAndSend(exEssenciais, rkEnvioEmail, dto);
    }
}