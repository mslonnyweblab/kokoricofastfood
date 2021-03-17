package br.com.manager.dto.provedor;

import br.com.manager.basedados.models.Ip;
import br.com.manager.basedados.models.Telefone;
import br.com.manager.validation.provedor.update.ProvedorUpdate;
import br.com.manager.validation.telefone.update.TelefoneUpdate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@ProvedorUpdate
public class UpdateProvedorForm implements Serializable {
    private static final long serialVersionUID = 1L;

    @Size(min = 10)
    private String site;

    @NotNull(message = "Domínio principal não pode ser null")
    @NotEmpty(message = "Domínio principal não pode ser vazio")
    @Size(min = 3, max = 100, message = "a mensagem deve estar entre 3 e 100 caracteres")
    private String dominioPrincipal;

    private String observacoes;

    @Email(message = "Email inválido")
    private String emailContato;

    @Size(min = 3, max = 80, message = "a mensagem deve estar entre 3 e 80 caracteres")
    private String nomeServidor;

    private List<String> porta = new ArrayList<>();

    private List<Ip> ip = new ArrayList<>();

    private Set<String> dominios = new HashSet<>();

    @TelefoneUpdate
    private List<Telefone> telefone = new ArrayList<>();


    public UpdateProvedorForm() {
    }

//======================================================================================================================


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDominioPrincipal() {
        return dominioPrincipal;
    }

    public void setDominioPrincipal(String dominioPrincipal) {
        this.dominioPrincipal = dominioPrincipal;
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

    @Override
    public String toString() {
        return "UpdateProvedorForm{" +
                "site='" + site + '\'' +
                ", dominioPrincipal='" + dominioPrincipal + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", emailContato='" + emailContato + '\'' +
                ", nomeServidor='" + nomeServidor + '\'' +
                ", porta=" + porta +
                ", ip=" + ip +
                ", dominios=" + dominios +
                ", telefone=" + telefone +
                '}';
    }
}
