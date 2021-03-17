package br.com.agi.EnvioDeDados.sms.dto;

import br.com.agi.core.ChannelAndRequest;
import br.com.agi.producer.interfaces.Dto;

import java.time.LocalTime;

public class SmsDto implements Dto {

    private String destinatario;
    private String mensagem;
    private String hora;

    public SmsDto() {
    }

    public SmsDto(String destinatario, String mensagem, String hora) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.hora = hora;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public static SmsDto protocolo() {
        return new SmsDto(ChannelAndRequest.getRequest().getCallerIdNumber(),
                "O número de protocolo desta ligação é: " + (long) (Math.random() * 1000000),
                LocalTime.now().toString());
    }
}