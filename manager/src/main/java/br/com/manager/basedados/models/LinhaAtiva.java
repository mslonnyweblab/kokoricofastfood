package br.com.manager.basedados.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "linha_ativa")
public class LinhaAtiva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer login;
    private Integer senha;


    @Temporal(TemporalType.DATE)
    private Date dataCadastramento = new Date(System.currentTimeMillis());

    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    @OneToOne
    @JoinColumn(name = "telefone_id")
    private Telefone telefone;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "provedor_id")
    private Provedor provedor;

    @OneToOne
    private Contexto contexto;

    public LinhaAtiva() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLogin() {
        return login;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }

    public Contexto getContexto() {
        return contexto;
    }

    public void setContexto(Contexto contexto) {
        this.contexto = contexto;
    }
}
