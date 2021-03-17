package br.com.envio.sms.entity.sms.implementacao;

import br.com.envio.sms.entity.sms.dto.SmsDto;
import br.com.envio.sms.entity.sms.interfaces.SmsInterface;
import org.springframework.stereotype.Component;

@Component
public class SmsImpl implements SmsInterface {

    @Override
    public void enviaSmsPost(SmsDto smsDto) {
        System.out.println("Chamei SMS IMPL, que implementa SMS INTERFACE");
    }



    @Override
    public void enviaSmsGet() {

    }
}
