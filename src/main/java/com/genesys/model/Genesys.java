package com.genesys.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Genesys {
    @Id
    private Integer id;
    private String name;
    private String email;
    private  String password;

    @OneToMany(mappedBy = "genesys",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<GenesysEmployee> employeeList;

    public Genesys() {
    }

    public Genesys(Integer id, String name, String email, String password, List<GenesysEmployee> employeeList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.employeeList = employeeList;
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

    public List<GenesysEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<GenesysEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Genesys{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
