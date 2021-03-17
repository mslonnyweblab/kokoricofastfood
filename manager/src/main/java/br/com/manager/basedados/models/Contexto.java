package br.com.manager.basedados.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contexto")
public class Contexto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    private String acao;

    public Contexto(Empresa empresa, String acao) {
        this.empresa = empresa;
        this.acao = acao;
    }

    public Contexto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
