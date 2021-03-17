package br.com.email.consumer.service;


import br.com.email.IO.form.EmailSuperClasseForm;
import br.com.email.consumer.service.interfaces.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(EmailSuperClasseForm form) {
        System.out.println("IMPRIMINDO MENSAGEM  -->> "+form);
    }
}
