package br.com.email.entidades.email;


import javax.mail.internet.MimeMessage;

public interface EmailService {

    void montagemDeEmailHtml(Email email);

    void enviarEmailHtml(MimeMessage mimeMessage);
}
