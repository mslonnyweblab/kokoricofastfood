package br.com.agi.support;

import br.com.agi.actions.StreamFile;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class Horas {
    private LocalTime manha1;
    private LocalTime manha2;
    private LocalTime tarde;
    private LocalTime noite;
    private LocalTime noite2;

    private LocalTime horaAtual;

    public Horas() {
        manha1 = LocalTime.of(05, 00);
        manha2 = LocalTime.of(12, 00);
        tarde = LocalTime.of(18, 00);
        noite = LocalTime.of(23, 59);
        noite2 = LocalTime.of(00, 00);
        horaAtual = LocalTime.now();
    }

    public void getPeriod() throws AgiException {
        //MANHÃ
        if (this.horaAtual.isAfter(this.manha1) && this.horaAtual.isBefore(this.manha2)) {
            StreamFile.toca("112");
        }

        //TARDE
        if (this.horaAtual.isAfter(this.manha2) && this.horaAtual.isBefore(this.tarde)) {
            StreamFile.toca("110");
        }

        //NOITE
        if (this.horaAtual.isAfter(this.tarde) && this.horaAtual.isBefore(this.noite)) {
            StreamFile.toca("111");
        }

        //NOITE
        if (this.horaAtual.isAfter(this.noite2) && this.horaAtual.isBefore(this.manha1)) {
            StreamFile.toca("111");
        }
    }
}