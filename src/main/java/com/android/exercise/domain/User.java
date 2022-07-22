package com.android.exercise.domain;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String password;

    public User() {}

    public User(String userId, String password) {
        this.id = userId;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return String.format("User[userId:%s, password: %s]", id, password);
    }
}
