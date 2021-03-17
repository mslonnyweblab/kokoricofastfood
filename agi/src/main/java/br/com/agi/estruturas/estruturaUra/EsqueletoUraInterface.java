package br.com.agi.estruturas.estruturaUra;

import org.asteriskjava.fastagi.AgiException;

public interface EsqueletoUraInterface {

    void header() throws AgiException;

    void body() throws AgiException;

    void footer() throws AgiException;

    void iniciaUra() throws AgiException;

    void envioSms();
}
