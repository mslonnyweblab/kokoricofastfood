package br.com.agi.EnvioDeDados.email.service;

import br.com.agi.producer.interfaces.Dto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Service
@FeignClient(name = "EMAIL", path = "/cliente")
public interface EmailFeign {

    @PostMapping
    ResponseEntity<String> enviaEmailPost(Dto pessoaQueEstaLigando);

    @GetMapping
    ResponseEntity<String> enviaEmailGet(Dto pessoaQueEstaLigando);

}