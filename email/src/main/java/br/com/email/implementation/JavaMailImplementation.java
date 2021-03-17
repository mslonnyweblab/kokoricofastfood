package br.com.email.implementation;

import br.com.email.entidades.email.AbstractEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.internet.MimeMessage;

public class JavaMailImplementation extends AbstractEmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void enviarEmailHtml(MimeMessage mimeMessage) {
        mailSender.send(mimeMessage);
    }


}
