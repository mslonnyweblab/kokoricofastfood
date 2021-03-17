package br.com.agi.producer;

import br.com.agi.producer.interfaces.AmqpProducer;
import br.com.agi.producer.interfaces.Dto;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Component;

@Component
public abstract class ProducerTempl implements AmqpProducer {


    @Override
    public void producer(Dto dto) {
        try {
            convertSend(dto);
        } catch (Exception reject) {
            throw new AmqpRejectAndDontRequeueException(reject);
        }
    }

    protected abstract void convertSend(Dto dto);


}