package com.android.exercise.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
public class User {
    @Id
    private String id;
    private String password;

    public User(String userId, String password) {
        this.id = userId;
        this.password = password;
    }
}
