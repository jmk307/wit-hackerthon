package com.android.exercise.dto.plant;

import com.android.exercise.domain.Plant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlantRequestDto {
    private String plantName;

    private String level;

    private Long totalExp;

    @Builder
    public Plant toEntity() {
        return Plant.builder()
                .plantName(plantName)
                .level("씨앗")
                .totalExp(0L)
                .build();
    }
}
