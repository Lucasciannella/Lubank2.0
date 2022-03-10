package com.bankproject.apilubank.model;


import javax.persistence.*;

@Entity(name = "users") //é uma entidade de banco de dados
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    public Long id;

    @Column(nullable = false, length = 50)
    public String email;

    @Column(nullable = false, length = 10)
    public String login;

    @Column(nullable = false, length = 6)
    public String senha;

    public UsuarioModel(String email, String login, String senha) {
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public UsuarioModel(){}


    //Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
