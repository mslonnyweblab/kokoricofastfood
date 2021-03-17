package br.com.manager.dto.provedor;

import br.com.manager.basedados.models.Ip;
import br.com.manager.basedados.models.LinhaAtiva;
import br.com.manager.basedados.models.Provedor;
import br.com.manager.basedados.models.Telefone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProvedorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String site;

    private String observacoes;

    private String emailContato;

    private String nomeServidor;

    private String dominioPrincipal;

    private List<String> porta = new ArrayList<>();

    private List<Ip> ip = new ArrayList<>();

    private Set<String> dominios = new HashSet<String>();

    private List<Telefone> telefone = new ArrayList<Telefone>();

    private List<LinhaAtiva> linhaAtiva = new ArrayList<LinhaAtiva>();

    public ProvedorDTO() {
    }

    public ProvedorDTO(Provedor provedor) {
        this.setSite(provedor.getSite());
        this.setObservacoes(provedor.getObservacoes());
        this.setEmailContato(provedor.getEmailContato());
        this.setNomeServidor(provedor.getNomeServidor());
        this.setDominioPrincipal(provedor.getDominioPrincipal());
        this.setPorta(provedor.getPorta());
        this.getIp().addAll(provedor.getIp());
        this.setDominios(provedor.getDominios());
        this.setTelefone(provedor.getTelefone());
        this.setLinhaAtiva(provedor.getLinhaAtiva());
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

    public List<LinhaAtiva> getLinhaAtiva() {
        return linhaAtiva;
    }

    public void setLinhaAtiva(List<LinhaAtiva> linhaAtiva) {
        this.linhaAtiva = linhaAtiva;
    }
}
