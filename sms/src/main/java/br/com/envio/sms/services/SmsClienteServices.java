package br.com.envio.sms.services;

import br.com.envio.sms.entity.sms.dto.SmsDto;
import br.com.envio.sms.entity.sms.interfaces.SmsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsClienteServices {

    @Autowired
    private SmsInterface smsInterface;


    public void enviaSmsPost(SmsDto smsDto) {
        smsInterface.enviaSmsPost(smsDto);
    }


}