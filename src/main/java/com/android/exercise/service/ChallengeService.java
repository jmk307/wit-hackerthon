package com.android.exercise.service;

import com.android.exercise.domain.Plant;
import com.android.exercise.dto.plant.PlantResponseDto;
import com.android.exercise.dto.plant.PlantUpdateRequestDto;
import com.android.exercise.exception.DuplicateMemberException;
import com.android.exercise.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChallengeService {
    private final ChallengeRepository challengeRepository;

    // 식물 분양받기
    public PlantResponseDto register(String plantName, PlantUpdateRequestDto plantUpdateRequestDto) {
        Plant plant = challengeRepository.getOneWithPlantName(plantName);
        plant.updateName(plantUpdateRequestDto.getPlantName());
        challengeRepository.save(plant);
        if (plant.getPlantName() != null) {
            throw new DuplicateMemberException("식물을 이미 분양받았습니다.");
        }
        else {
            return new PlantResponseDto(plant);
        }
    }
    
    // 회원식물 보여주기
    public PlantResponseDto userPlant(String plantName) {
        return new PlantResponseDto(challengeRepository.getOneWithPlantName(plantName));
    }

    // 식물 경험치 증가
    public PlantResponseDto updatePlant(String plantName, PlantUpdateRequestDto plantUpdateRequestDto) {
        Plant plant = challengeRepository.findByPlantName(plantName);
        plant.update(plantUpdateRequestDto.getExp());
        challengeRepository.save(plant);
        return new PlantResponseDto(plant);
    }
}
