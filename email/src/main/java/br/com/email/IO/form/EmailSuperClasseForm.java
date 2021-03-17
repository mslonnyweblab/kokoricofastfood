package br.com.email.IO.form;

import br.com.email.IO.dto.EmailSuperClasseDto;
import br.com.email.entidades.email.EmailSuperClasse;

import java.io.Serializable;

public class EmailSuperClasseForm extends EmailSuperClasse implements Serializable {
    private static final long serialVersionUID = 1L;


    public EmailSuperClasseDto toPadraoDto(EmailSuperClasseForm padraoForm) {
        EmailSuperClasseDto padraoDto = new EmailSuperClasseDto();

        return padraoDto;
    }
}