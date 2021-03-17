package br.com.agi.interfaces;

import org.asteriskjava.fastagi.AgiException;

public interface Valida {

    public boolean valida() throws AgiException;

    public String getOpcaoInvalida();

    public String getAutoDesligamento();

    public String getUmaTentativa();

    public String getDuasTentativas();

    public Integer getMaximoTentativas();


}
