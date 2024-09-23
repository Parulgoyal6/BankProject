package com.smart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID
    private Long id;

    private String name;

    public Branch() {
        // Default constructor required by JPA
    }

    public Branch(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
