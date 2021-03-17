package br.com.manager.dto.telefone;

import java.io.Serializable;

public class TelefoneForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numero;

    public TelefoneForm(String numero) {
        this.numero = numero;
    }

    public TelefoneForm() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
