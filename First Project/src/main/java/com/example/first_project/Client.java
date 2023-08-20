package com.example.first_project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Client {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Integer phone;

    @Column(nullable = false)
    private String advisor;

    protected Client(){

    }

    public Client(String firstName, String lastName, Integer phone, String advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

}
