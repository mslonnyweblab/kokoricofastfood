package br.com.agi.EnvioDeDados.sms.implementacao;


import br.com.agi.estruturas.estruturaEnvioMsg.EnviadorMessageTemplate;
import br.com.agi.EnvioDeDados.sms.servico.SmsFeign;
import br.com.agi.producer.interfaces.Dto;
import br.com.agi.producer.sms.implementations.ProducerSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnviaSmsImpl extends EnviadorMessageTemplate {

    @Autowired
    private SmsFeign smsFeign;

    @Autowired
    private ProducerSms producerSms;


    @Override
    protected void enviaMsgPost(Dto dto) {
        smsFeign.enviaSmsPost(dto);
    }

    @Override
    protected void enviaMsgGet(Dto dto) {
        smsFeign.enviaSmsGet(dto);
    }

    @Override
    protected void sendMsgFromProducer(Dto dto) {
        producerSms.producer(dto);
    }

}