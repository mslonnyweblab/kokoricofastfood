package br.com.oauth.entity.roles;

public class Roles {
    private String name;

    public Roles() {
        name = RolesEnum.CLIENTE.name();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
