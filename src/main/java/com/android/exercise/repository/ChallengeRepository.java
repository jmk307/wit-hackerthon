package com.android.exercise.repository;

import com.android.exercise.domain.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Plant, Long> {

}
