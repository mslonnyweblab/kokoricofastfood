package br.com.agi.support;

public enum Periodo {
    MANHA("manha"), TARDE("tarde"), NOITE("noite");

    private final String nome;

    private Periodo(String nome) {
        this.nome = nome;
    }

}
