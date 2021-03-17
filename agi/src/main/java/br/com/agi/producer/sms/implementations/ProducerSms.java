package br.com.agi.producer.sms.implementations;

import br.com.agi.producer.interfaces.Dto;
import br.com.agi.producer.ProducerTempl;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerSms extends ProducerTempl {


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

    @Autowired
    private RabbitTemplate template;


    @Override
    public void convertSend(Dto dto) {
        template.convertAndSend(exServicos, rkEnvioSms, dto);
    }


}