package br.com.manager.dto.provedor;


import br.com.manager.basedados.models.Ip;
import br.com.manager.basedados.models.Telefone;
import br.com.manager.validation.provedor.insert.ProvedorInsert;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ProvedorInsert
public class CadastroProvedorForm implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "SITE do provedor não pode ser null")
    @NotEmpty(message = "SITE do provedor não pode ser vazio")
    @Size(min = 6)
    private String site;

    private String observacoes;

    private String emailContato;


    @NotNull(message = "Nome do provedor não pode ser null")
    @NotEmpty(message = "Nome do provedor não pode ser vazio")
    @Size(min = 3, max = 80)
    private String nomeServidor;

    @NotNull(message = "Domínio principal não pode ser null")
    @NotEmpty(message = "Domínio principal não pode ser vazio")
    @Size(min = 3, max = 100, message = "a mensagem deve estar entre 3 e 100 caracteres")
    private String dominioPrincipal;


    private List<String> porta = new ArrayList<>();

    @NotNull(message = "IP do provedor não pode ser null")
    @NotEmpty(message = "IP do provedor não pode ser vazio")
    private List<Ip> ip = new ArrayList<>();


    @NotNull(message = "DOMINIO do provedor não pode ser null")
    @NotEmpty(message = "DOMINIO do provedor não pode ser vazio")
    private Set<String> dominios = new HashSet<String>();



    @NotNull(message = "TELEFONE do provedor não pode ser null")
    @NotEmpty(message = "TELEFONE do provedor não pode ser vazio")
    private List<Telefone> telefone = new ArrayList<Telefone>();


    public CadastroProvedorForm() {
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public String getDominioPrincipal() {
        return dominioPrincipal;
    }

    public void setDominioPrincipal(String dominioPrincipal) {
        this.dominioPrincipal = dominioPrincipal;
    }

    public List<String> getPorta() {
        return porta;
    }

    public void setPorta(List<String> porta) {
        this.porta = porta;
    }

    public List<Ip> getIp() {
        return ip;
    }

    public void setIp(List<Ip> ip) {
        this.ip = ip;
    }

    public Set<String> getDominios() {
        return dominios;
    }

    public void setDominios(Set<String> dominios) {
        this.dominios = dominios;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
}
