package com.example.first_project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Portfolio {

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private Integer security;

    protected Portfolio(){

    }

    public Portfolio(String name, Integer security) {
        this.name = name;
        this.security = security;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSecurity() {
        return security;
    }

    public void setSecurity(Integer security) {
        this.security = security;
    }


}
