package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int ID;
    String username;
    char gender;
    LocalDate dateOfBirth;
    int postCount;

    public ForumUser(int ID, String username, char gender, LocalDate dateOfBirth, int postCount) {
        this.ID = ID;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
