package com.kodilla.good.patterns.challenges.food2door;

public class User {
    String username;
    String realName;
    String address;
    String email;

    public User(String username, String realName, String address, String email) {
        this.username = username;
        this.realName = realName;
        this.address = address;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
