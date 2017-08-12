package com.parser.server.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "\"user\"")
@SequenceGenerator(name = "seq", sequenceName = "user_seq")
public class User extends IdentityObject {

    @Column(nullable = false, unique = true)
    private String login;

    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
