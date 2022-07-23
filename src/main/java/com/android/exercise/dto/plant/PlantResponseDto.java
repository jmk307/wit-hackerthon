package com.android.exercise.dto.plant;

import com.android.exercise.domain.Plant;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlantResponseDto {
    private Long plantId;

    private String plantName;

    private String level;

    private Long totalExp;

    public PlantResponseDto(Plant plant) {
        this.plantId = plant.getPlantId();
        this.plantName = plant.getPlantName();
        this.level = "씨앗";
        this.totalExp = 0L;
    }
}
