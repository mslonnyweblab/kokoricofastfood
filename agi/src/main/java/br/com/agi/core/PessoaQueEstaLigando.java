package br.com.agi.core;

import br.com.agi.producer.interfaces.Dto;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;


/*
 * Essa classe é responsável por guardar o dados do usuário.
 * */
@Component
public class PessoaQueEstaLigando implements Dto, Serializable {
    private static final long serialVersionUID = 1L;

    private String opcaoMenuPrincipal;

    private String cpf = "";
    private String nome = "";
    private String telefone = "";
    private String cep = "";
    private String numeroEntrega = "";


    private LocalDateTime horaDaligacao;


    public PessoaQueEstaLigando() {
    }

    public String getOpcaoMenuPrincipal() {
        return opcaoMenuPrincipal;
    }

    public void setOpcaoMenuPrincipal(String opcaoMenuPrincipal) {
        this.opcaoMenuPrincipal = opcaoMenuPrincipal;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(String numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public LocalDateTime getHoraDaligacao() {
        return horaDaligacao;
    }

    public void setHoraDaligacao(LocalDateTime horaDaligacao) {
        this.horaDaligacao = horaDaligacao;
    }
}