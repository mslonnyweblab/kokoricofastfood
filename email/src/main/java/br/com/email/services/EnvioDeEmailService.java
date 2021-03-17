package br.com.email.services;

import br.com.email.IO.dto.EmailSuperClasseDto;
import br.com.email.entidades.email.Email;
import br.com.email.implementation.JavaMailImplementation;
import br.com.email.support.Suporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioDeEmailService {

    @Autowired
    private JavaMailImplementation envioDeFato;

    private String remetente = "remetente@remetente.com.br";


    public String enviaEmail() {

        Email email = new Email("ASSUNTO MUITO IMPORTANTE", "ESSE É O CORPO DO E-MAIL", "");

        email.setFrase(Suporte.getFrase());

        envioDeFato.montagemDeEmailHtml(email);

        return "Envio de email efetuado";
    }

    public String enviaEmail(EmailSuperClasseDto padraoDto) {

        Email email = new Email("Saudações !!!", "ESSE É O CORPO DO E-MAIL", "o destino");

        email.setFrase(Suporte.getFrase());

        envioDeFato.montagemDeEmailHtml(email);

        return "Envio de email efetuado";
    }
}
