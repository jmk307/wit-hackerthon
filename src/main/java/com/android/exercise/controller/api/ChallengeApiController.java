package com.android.exercise.controller.api;

import com.android.exercise.dto.plant.PlantRequestDto;
import com.android.exercise.dto.plant.PlantResponseDto;
import com.android.exercise.service.ChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "challenge/plants")
public class ChallengeApiController {
    private final ChallengeService challengeService;

    @PostMapping
    public ResponseEntity<PlantResponseDto> postAdd(@RequestBody PlantRequestDto plantRequestDto) {
        return ResponseEntity.ok(challengeService.register(plantRequestDto));
    }
}
