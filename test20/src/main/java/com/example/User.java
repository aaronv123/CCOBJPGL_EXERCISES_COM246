package com.example;

public class User {
    private String username;
    private String password;
    private int phonenumber;

    public User(String username, String password, int phonenumber) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPhonenumber() {
        return this.phonenumber;
    }
}
