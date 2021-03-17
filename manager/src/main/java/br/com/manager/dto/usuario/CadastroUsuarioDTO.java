package br.com.manager.dto.usuario;

import br.com.manager.basedados.models.LinhaAtiva;
import br.com.manager.basedados.models.Telefone;
import br.com.manager.basedados.models.Usuario;
import org.hibernate.validator.constraints.Length;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class CadastroUsuarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    @Email(message = "Informações inválidas")
    @NotNull(message = "Informe o email")
    private String email;

    @Length(min = 10, max = 80)
    private String senha;

    private Date dataVencimento;

    private List<Telefone> telefone;



    private List<String> referencias;

    private List<LinhaAtiva> linhasAtivas;

    public CadastroUsuarioDTO() {
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


    public List<String> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<String> referencias) {
        this.referencias = referencias;
    }

    public List<LinhaAtiva> getLinhasAtivas() {
        return linhasAtivas;
    }

    public void setLinhasAtivas(List<LinhaAtiva> linhasAtivas) {
        this.linhasAtivas = linhasAtivas;
    }


}
