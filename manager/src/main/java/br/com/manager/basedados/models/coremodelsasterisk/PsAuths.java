package br.com.manager.basedados.models.coremodelsasterisk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name = "ps_auths")
public class PsAuths implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = true, length = 100)
    private Integer id;

    @Column(name = "auth_type", nullable = true, length = 8)
    private String authType = "userpass";

    @Column(name = "nonce_lifetime", nullable = true, length = 11)
    private Integer nonceLifetime;

    @Column(name = "md5_cred", nullable = true, length = 40)
    private String md5Cred;

    @Column(name = "password", nullable = false, length = 80)
    private String password;

    @Column(name = "realm", nullable = true, length = 40)
    private String realm;

    @Column(name = "username", nullable = false, length = 40)
    private String username;

    public PsAuths() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public Integer getNonceLifetime() {
        return nonceLifetime;
    }

    public void setNonceLifetime(Integer nonceLifetime) {
        this.nonceLifetime = nonceLifetime;
    }

    public String getMd5Cred() {
        return md5Cred;
    }

    public void setMd5Cred(String md5Cred) {
        this.md5Cred = md5Cred;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
