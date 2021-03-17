package br.com.acesso.baseCredentials.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;
    private String contaNaoBloqueada;
    private String contaNaoExpirada;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Roles> roles = new HashSet<>();


    public User() {
        this.contaNaoBloqueada = "true";
        this.contaNaoExpirada = "true";
    }

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        /*TODOS OS USUÁRIOS, SERÃO */
        this.contaNaoBloqueada = "true";
        this.contaNaoExpirada = "true";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    public Boolean getContaNaoBloqueada() {
        return Boolean.valueOf(contaNaoBloqueada);
    }

    public void setContaNaoBloqueada(Boolean contaBloqueada) {
        this.contaNaoBloqueada = String.valueOf(contaBloqueada);
    }

    public Boolean getContaNaoExpirada() {
        return Boolean.valueOf(contaNaoExpirada);
    }

    public void setContaNaoExpirada(Boolean contaExpirada) {
        this.contaNaoExpirada = String.valueOf(contaExpirada);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
