package br.com.email.entidades.email;

public class Email {

    private String assunto;
    private String corpo;
    private String destinatario;
    private String remetente;
    private String frase;

    public Email() {
    }

    public Email(String assunto, String corpo, String destinatario) {
        this.assunto = assunto;
        this.corpo = corpo;
        this.destinatario = destinatario;
    }

    /*
     *
     * SETTER'S
     *
     * */


    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    /*
    *
    * GETTER'S
    *
    * */

    public String getAssunto() {
        return assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getFrase() {
        return frase;
    }
}
