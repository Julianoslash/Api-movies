package com.filmes.filmes_rest_api.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "users")
public class UsersModel {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy = "increment")
    public Integer cod_user;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false, unique = true)
    public String email;

    @Column(nullable = true)
    public String password;

    public Integer getCod_user() {
        return cod_user;
    }

    public void setCod_user(Integer cod_user) {
        this.cod_user = cod_user;
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
}
