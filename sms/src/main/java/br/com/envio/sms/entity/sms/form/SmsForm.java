package br.com.envio.sms.entity.sms.form;

public class SmsForm {

    private String destinatario;
    private String mensagem;

    public SmsForm(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
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
}