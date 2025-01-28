package com.genesys.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Entity
public class GenesysEmployee {
    @Id
    private Integer empId;
    private String empName;
    private String empEmail;
    private String empPassword;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    private Genesys genesys;

    public GenesysEmployee() {
    }

    public GenesysEmployee(Integer empId, Genesys genesys, String empPassword, String empEmail, String empName) {
        this.empId = empId;
        this.genesys = genesys;
        this.empPassword = empPassword;
        this.empEmail = empEmail;
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public Genesys getGenesys() {
        return genesys;
    }

    public void setGenesys(Genesys genesys) {
        this.genesys = genesys;
    }

    @Override
    public String toString() {
        return "GenesysEmployee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", genesys=" + genesys +
                '}';
    }
}
