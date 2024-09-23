package com.smart.model;

import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches; // List of Branch objects
    private List<String> services;  // List of service names

    // Constructor
    public Bank(String name, List<Branch> branches, List<String> services) {
        this.name = name;
        this.branches = branches;
        this.services = services;
    }

    // Default Constructor (Optional, useful for frameworks like Spring)
    public Bank() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    // Optional: A toString method for easy printing/debugging
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", branches=" + branches +
                ", services=" + services +
                '}';
    }
}
