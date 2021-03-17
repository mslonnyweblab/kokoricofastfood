package br.com.envio.sms.entity.sms.interfaces;

import br.com.envio.sms.entity.sms.dto.SmsDto;

public interface SmsInterface {

    void enviaSmsPost(SmsDto smsDto);

    void enviaSmsGet();

}
