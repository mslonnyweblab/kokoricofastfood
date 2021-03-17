package br.com.agi.dados;

import br.com.agi.core.PessoaQueEstaLigando;
import br.com.agi.validacoes.*;
import org.asteriskjava.fastagi.AgiException;

public class Dados {

    private Dados dados;
    private PessoaQueEstaLigando pessoaQueEstaLigando;

    public Dados(PessoaQueEstaLigando pessoaQueEstaLigando) {
        this.pessoaQueEstaLigando = pessoaQueEstaLigando;
    }

    public void getCPF() throws AgiException {
        ValidaTentativas.run(new ValidaCpf(this.getPessoaQueEstaLigando()));
    }


    public PessoaQueEstaLigando getPessoaQueEstaLigando() {
        return pessoaQueEstaLigando;
    }

    public void setPessoaQueEstaLigando(PessoaQueEstaLigando pessoaQueEstaLigando) {
        this.pessoaQueEstaLigando = pessoaQueEstaLigando;
    }
}