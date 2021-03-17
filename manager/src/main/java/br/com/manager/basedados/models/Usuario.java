package br.com.manager.basedados.models;


import br.com.manager.dto.usuario.CadastroUsuarioDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String email;

    private String senha;

    @Temporal(TemporalType.DATE)
    private Date dataCadastramento = new Date(System.currentTimeMillis());

    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    @OneToMany
    private List<Telefone> telefone = new ArrayList<Telefone>();

    @ElementCollection
    @CollectionTable(name = "referencias")
    private Set<String> referencias = new HashSet<String>();


    @OneToMany(mappedBy = "usuario")
    private List<LinhaAtiva> linhasAtivas = new ArrayList<LinhaAtiva>();

    public Usuario() {
    }

    public Usuario(Integer id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastramento() {
        return dataCadastramento;
    }

    public void setDataCadastramento(Date dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Set<String> getReferencias() {
        return referencias;
    }

    public void setReferencias(Set<String> referencias) {
        this.referencias = referencias;
    }

    public List<LinhaAtiva> getLinhasAtivas() {
        return linhasAtivas;
    }

    public void setLinhasAtivas(List<LinhaAtiva> linhasAtivas) {
        this.linhasAtivas = linhasAtivas;
    }
}