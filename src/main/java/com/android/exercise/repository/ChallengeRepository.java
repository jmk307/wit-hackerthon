package com.android.exercise.repository;

import com.android.exercise.domain.Plant;
import com.android.exercise.dto.plant.PlantResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChallengeRepository extends JpaRepository<Plant, Long> {

    PlantResponseDto findByplantName(String plantName);

    Plant findByPlantName(String plantName);

    @Query(value = "select p from Plant p left join p.member m where m.username = :plantName")
    Plant getOneWithPlantName(String plantName);
}
