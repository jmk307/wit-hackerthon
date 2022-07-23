package com.android.exercise.service;

import com.android.exercise.dto.EnvTest.EnvTestResponseDto;
import com.android.exercise.repository.EnvTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnvTestService {
    private final EnvTestRepository envTestRepository;

    public EnvTestResponseDto getTestOne(Long step) {
        return envTestRepository.findByStep(step);
    }
}
