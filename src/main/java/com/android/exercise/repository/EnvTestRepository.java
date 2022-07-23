package com.android.exercise.repository;

import com.android.exercise.domain.EnvTest;
import com.android.exercise.dto.EnvTest.EnvTestResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvTestRepository extends JpaRepository<EnvTest, Long> {

    EnvTestResponseDto findByStep(Long step);
}
