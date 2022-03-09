package com.bankproject.apilubank.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario") //é uma entidade de banco de dados
public class UsuarioModel {

    @Id
    public Integer id;

    @Column(nullable = false, length = 50)
    public String email;

    @Column(nullable = false, length = 10)
    public String login;

    @Column(nullable = false, length = 6)
    public String senha;


    //Getters and Setters


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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
