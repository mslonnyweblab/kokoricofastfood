package br.com.manager.basedados.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "empresas")
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 11)
    private Integer id;

    @Column(unique = true)
    private String nome;

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date data;

    @JsonIgnore
    @OneToMany(mappedBy = "empresa")
    private List<Contexto> contexto = new ArrayList<>();


    public Empresa(String nome) {
        this.nome = nome;
    }

    public Empresa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contexto> getContexto() {
        return contexto;
    }

    public void setContexto(List<Contexto> contexto) {
        this.contexto = contexto;
    }
}
