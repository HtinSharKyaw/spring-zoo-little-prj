package com.example.zoospringdata.entities;

import javax.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private int totalNumber;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

    public Animal(){

    }

    public Animal(String type, int totalNumber) {
        this.type = type;
        this.totalNumber = totalNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", totalNumber=" + totalNumber +
                '}';
    }
}
