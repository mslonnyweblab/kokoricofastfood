package br.com.email.entidades.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@RefreshScope
@Profile("default")
public abstract class AbstractEmailService implements EmailService {


    @Autowired
    private JavaMailSender mailSender;


    @Autowired
    private TemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String remetente;

    @Override
    public void montagemDeEmailHtml(Email email) {
        email.setDestinatario(remetente);

        MimeMessage mimeMessage = prepareHtmlMailMessage(email);

        enviarEmailHtml(mimeMessage);
    }

    protected MimeMessage prepareHtmlMailMessage(Email email) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper mmh = null;
        try {

            // SETA EMAIL DO TIPO HTML
            mmh = new MimeMessageHelper(mimeMessage, true);

            // DESTINATÁRIO
            mmh.setTo(email.getDestinatario());

            // REMETENTE
            mmh.setFrom(remetente);

            // ASSUNTO
            mmh.setSubject(email.getAssunto());


            // DATA DO EMAIL
            mmh.setSentDate(new Date(System.currentTimeMillis()));

            // CORPO DO E-MAIL
            mmh.setText(htmlFromTemplatePedido(email), true);

            mmh.addInline("logo", new ClassPathResource("/static/img/logo-letra.jpeg"));
            mmh.addInline("banner", new ClassPathResource("/static/img/banner-plus-info.jpeg"));
            mmh.addInline("propsite", new ClassPathResource("/static/img/propaganda-site.jpeg"));
            mmh.addInline("propura", new ClassPathResource("/static/img/propaganda-ura.jpeg"));
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return mimeMessage;
    }

    private String htmlFromTemplatePedido(Email email) {
        Context context = new Context();
        context.setVariable("objeto", email);

        return templateEngine.process("email/confirmacaoCompra", context);
    }
}