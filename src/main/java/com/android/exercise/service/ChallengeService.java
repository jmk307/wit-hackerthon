package com.android.exercise.service;

import com.android.exercise.domain.Plant;
import com.android.exercise.dto.plant.PlantRequestDto;
import com.android.exercise.dto.plant.PlantResponseDto;
import com.android.exercise.repository.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChallengeService {
    private final ChallengeRepository challengeRepository;

    public PlantResponseDto register(PlantRequestDto plantRequestDto) {
        Plant plant = plantRequestDto.toEntity();
        challengeRepository.save(plant);
        return new PlantResponseDto(plant);
    }
}
