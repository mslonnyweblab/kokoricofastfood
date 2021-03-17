package br.com.manager.basedados.models;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column(unique = true)
    private String numero;

    public Telefone() {
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    public Telefone(Integer id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


}
