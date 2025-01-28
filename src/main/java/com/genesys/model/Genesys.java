package com.genesys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Genesys {
    @Id
    private Integer id;
    private String name;
    private String email;
    private  String password;

    public Genesys() {
    }

    public Genesys(String password, String name, String email, Integer id) {
        this.password = password;
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genesys{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
