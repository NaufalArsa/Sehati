package com.example.sehati.model;

public class User {
    public String name, email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
