package br.com.envio.sms.resources;

import br.com.envio.sms.entity.sms.form.SmsForm;
import br.com.envio.sms.services.SmsClienteServices;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

    @Autowired
    private SmsClienteServices smsClienteServices;

    @HystrixCommand(fallbackMethod = "enviaAlternative")
    @PostMapping
    public void envia(@RequestBody SmsForm smsForm) {
        System.out.println("CHEGUEI NO ENVIO");
        System.out.println("IMPRIMINDO O SMS QUE CHEGOU NO SERVIDOR  > " + smsForm);
        System.out.println("Enviando implementacao para o número  > " + smsForm.getDestinatario());
        System.out.println("Enviando a mensagem  > " + smsForm.getMensagem());

//        smsClienteServices.enviaSmsPost();
    }

    public void enviaAlternative(SmsForm smsForm) {
        System.out.println("ENVIANDO SMS");
//        smsClienteServices.enviaSmsPost();
    }
}