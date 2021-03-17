package br.com.manager.basedados.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "audios_ura")public class AudiosUra implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, length = 100)
    private Integer id;

    @Column(name = "identificacao", nullable = false, length = 20)
    private String identificacao;

    @Lob
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    public AudiosUra(String identificacao, String descricao) {
        this.identificacao = identificacao;
        this.descricao = descricao;
    }

    public AudiosUra() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
