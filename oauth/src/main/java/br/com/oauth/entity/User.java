package br.com.oauth.entity;

import br.com.oauth.entity.roles.Roles;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class User implements UserDetails {

    private String email;
    private String password;
    private Boolean contaBloqueada;
    private Boolean contaExpirada;

    private Set<Roles> roles = new HashSet<>();


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(roles ->   new SimpleGrantedAuthority(roles.getName())  ).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getContaBloqueada() {
        return contaBloqueada;
    }

    public void setContaBloqueada(Boolean contaBloqueada) {
        this.contaBloqueada = contaBloqueada;
    }

    public Boolean getContaExpirada() {
        return contaExpirada;
    }

    public void setContaExpirada(Boolean contaExpirada) {
        this.contaExpirada = contaExpirada;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contaBloqueada=" + contaBloqueada +
                ", contaExpirada=" + contaExpirada +
                ", roles=" + roles +
                '}';
    }
}
