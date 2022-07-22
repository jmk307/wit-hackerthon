package com.android.exercise.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    private String id;
    private String password;

    public User(String userId, String password) {
        this.id = userId;
        this.password = password;
    }
}
