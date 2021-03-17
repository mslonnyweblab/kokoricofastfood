package br.com.email.consumer.implementacao;

import br.com.email.IO.form.EmailSuperClasseForm;
import br.com.email.consumer.interfaces.AmqpConsumer;
import br.com.email.consumer.service.ConsumerServiceImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer implements AmqpConsumer<EmailSuperClasseForm> {

    @Autowired
    private ConsumerServiceImpl consumerService;


    @RabbitListener(queues = "q.envio.email")
    @Override
    public void consumer(EmailSuperClasseForm padraoForm) {
        consumerService.action(padraoForm);
    }
}
