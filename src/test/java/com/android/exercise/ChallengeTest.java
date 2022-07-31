package com.android.exercise;

import com.android.exercise.domain.Plant;
import com.android.exercise.repository.ChallengeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChallengeTest {

    @Autowired
    ChallengeRepository challengeRepository;

    @Test
    void read() {
        String plantName = "agnes4577";
        Plant plant = challengeRepository.getOneWithPlantName(plantName);
    }
}
