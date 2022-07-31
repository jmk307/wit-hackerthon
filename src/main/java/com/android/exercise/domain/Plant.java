package com.android.exercise.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plantId;

    private String plantName;

    private String level;

    private Long totalExp;

    @OneToOne(mappedBy = "plant")
    private Member member;

    public void update(Long totalExp) {
        this.totalExp += totalExp;
    }

    public void updateName(String plantName) { this.plantName = plantName; }
}
