package br.com.agi.estruturas.estruturaUra;

import br.com.agi.core.PessoaQueEstaLigando;
import org.asteriskjava.fastagi.AgiException;
import org.springframework.stereotype.Component;

@Component
public abstract class EsqueletoUraTempl implements EsqueletoUraInterface {
    private final PessoaQueEstaLigando pessoaQueEstaLigando;

    public EsqueletoUraTempl() {
        this.pessoaQueEstaLigando = new PessoaQueEstaLigando();
    }

    public PessoaQueEstaLigando getPessoaQueEstaLigando() {
        return pessoaQueEstaLigando;
    }


    /*
     *
     * No header temos passos incomum para algumas aplicações
     * Mandar Email
     * Mandar Sms
     * O OBJETIVO DESSA CLASSE, É FORNECER UM PADRÃO DE DESENVOLVIMENTO DE UMA URA
     * */

    @Override
    public void header() throws AgiException {
        this.implementacaoHeader();
    }

    @Override
    public void body() throws AgiException {
        this.implementacaoBody();
    }

    @Override
    public void footer() throws AgiException {
        this.implementacaoFooter();
    }

    @Override
    public void iniciaUra() throws AgiException {
        this.header();
        this.body();
        this.footer();
    }


    protected abstract void implementacaoHeader() throws AgiException;

    protected abstract void implementacaoBody() throws AgiException;

    protected abstract void implementacaoFooter() throws AgiException;
}