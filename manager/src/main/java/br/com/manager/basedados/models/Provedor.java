package br.com.manager.basedados.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "provedor")
public class Provedor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String site;
    private String observacoes;
    private String emailContato;
    private String nomeServidor;

    @Column(name = "dominio_principal", unique = true)
    private String dominioPrincipal;

    @ElementCollection
    @CollectionTable(name = "porta")
    private List<String> porta = new ArrayList<>();

    @OneToMany
    @Column(name = "ip")
    private List<Ip> ip = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "dominios")
//    @Column(unique = true)
    private Set<String> dominios = new HashSet<String>();

    @OneToMany
    private List<Telefone> telefone = new ArrayList<>();

    @OneToMany(mappedBy = "provedor", fetch = FetchType.LAZY)
    @JsonIgnore
//    @Column(unique = true)
    private List<LinhaAtiva> linhaAtiva = new ArrayList<LinhaAtiva>();

    public Provedor() {
    }

    public Provedor(Integer id, String site, String observacoes, String emailContato, String nomeServidor, String dominioPrincipal) {
        this.id = id;
        this.site = site;
        this.observacoes = observacoes;
        this.emailContato = emailContato;
        this.nomeServidor = nomeServidor;
        this.dominioPrincipal = dominioPrincipal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provedor provedor = (Provedor) o;
        return getId().equals(provedor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Provedor{" +
                "id=" + id +
                ", site='" + site + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", emailContato='" + emailContato + '\'' +
                ", nomeServidor='" + nomeServidor + '\'' +
                ", dominioPrincipal='" + dominioPrincipal + '\'' +
                ", porta=" + porta +
                ", ips=" + ip +
                ", dominios=" + dominios +
                ", telefone=" + telefone +
                ", linhaAtiva=" + linhaAtiva +
                '}';
    }


}