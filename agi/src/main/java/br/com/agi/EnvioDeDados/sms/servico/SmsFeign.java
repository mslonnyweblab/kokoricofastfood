package br.com.agi.EnvioDeDados.sms.servico;

import br.com.agi.producer.interfaces.Dto;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Configurable
@Service
@FeignClient(name = "API-SMS", path = "/cliente")
public interface SmsFeign {

    @PostMapping
    void enviaSmsPost(Dto dto);

    @GetMapping
    void enviaSmsGet(Dto dto);
}