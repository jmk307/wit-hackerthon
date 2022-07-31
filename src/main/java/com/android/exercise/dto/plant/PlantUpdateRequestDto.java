package com.android.exercise.dto.plant;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PlantUpdateRequestDto {

    private String plantName;

    private Long exp;

    public PlantUpdateRequestDto(Long exp, String plantName) {
        this.plantName = plantName;
        this.exp = exp;
    }
}
