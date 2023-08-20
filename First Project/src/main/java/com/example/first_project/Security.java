package com.example.first_project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Security {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Integer purchagedate;

    @Column(nullable = false)
    private Integer purchageprice;

    @Column(nullable = false)
    private Integer quantity;

    protected Security(){

    }

    public Security(String name, String category, Integer purchagedate, Integer purchageprice, Integer quantity) {
        this.name = name;
        this.category = category;
        this.purchagedate = purchagedate;
        this.purchageprice = purchageprice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPurchagedate() {
        return purchagedate;
    }

    public void setPurchagedate(Integer purchagedate) {
        this.purchagedate = purchagedate;
    }

    public Integer getPurchageprice() {
        return purchageprice;
    }

    public void setPurchageprice(Integer purchageprice) {
        this.purchageprice = purchageprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
