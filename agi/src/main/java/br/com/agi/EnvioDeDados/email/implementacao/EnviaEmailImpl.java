package br.com.agi.EnvioDeDados.email.implementacao;

import br.com.agi.estruturas.estruturaEnvioMsg.EnviadorMessageTemplate;
import br.com.agi.EnvioDeDados.email.service.EmailFeign;
import br.com.agi.producer.email.implementations.ProducerEmail;
import br.com.agi.producer.interfaces.Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnviaEmailImpl extends EnviadorMessageTemplate {

    @Autowired
    private EmailFeign emailFeign;

    @Autowired
    private ProducerEmail producerEmail;


    @Override
    protected void enviaMsgPost(Dto dto) {
        emailFeign.enviaEmailPost(dto);
    }

    @Override
    protected void enviaMsgGet(Dto dto) {
        emailFeign.enviaEmailGet(dto);
    }

    @Override
    protected void sendMsgFromProducer(Dto dto) {
        producerEmail.producer(dto);
    }
}
