package br.com.manager.dto;

import java.io.Serializable;


public class CadastroDeUsuarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer usuario;
    private Integer senha;
    private Integer numeroTelefone;
    private Integer ipProvedor;
    private Integer porta;
    private Integer dominioProvedor;
    private Integer contexto;
    private Integer dataCadastramento;
    private Integer dataVencimento;

    public CadastroDeUsuarioDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Integer getIpProvedor() {
        return ipProvedor;
    }

    public void setIpProvedor(Integer ipProvedor) {
        this.ipProvedor = ipProvedor;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public Integer getDominioProvedor() {
        return dominioProvedor;
    }

    public void setDominioProvedor(Integer dominioProvedor) {
        this.dominioProvedor = dominioProvedor;
    }

    public Integer getContexto() {
        return contexto;
    }

    public void setContexto(Integer contexto) {
        this.contexto = contexto;
    }

    public Integer getDataCadastramento() {
        return dataCadastramento;
    }

    public void setDataCadastramento(Integer dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

    public Integer getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Integer dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "CadastroDeUsuarioDTO{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", senha=" + senha +
                ", numeroTelefone=" + numeroTelefone +
                ", ipProvedor=" + ipProvedor +
                ", porta=" + porta +
                ", dominioProvedor=" + dominioProvedor +
                ", contexto=" + contexto +
                ", dataCadastramento=" + dataCadastramento +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}
