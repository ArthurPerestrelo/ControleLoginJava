package model;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String username;
    private String senha;
    private String cargo;

    public Usuario(String username, String senha, String cargo) {
        this.username = username;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public String getCargo() {
        return cargo;
    }
}
