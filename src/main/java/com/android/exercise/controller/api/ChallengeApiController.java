package com.android.exercise.controller.api;

import com.android.exercise.dto.plant.PlantResponseDto;
import com.android.exercise.dto.plant.PlantUpdateRequestDto;
import com.android.exercise.service.ChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "challenge/plants")
public class ChallengeApiController {
    private final ChallengeService challengeService;

    // 식물 분양받기
    @PostMapping
    public ResponseEntity<PlantResponseDto> postAdd(@RequestBody PlantUpdateRequestDto plantUpdateRequestDto, Authentication authentication) {
        return ResponseEntity.ok(challengeService.register(authentication.getName(), plantUpdateRequestDto));
    }

    // 분양받은 식물 보기
    @GetMapping
    public ResponseEntity<PlantResponseDto> getUserPlant(Authentication authentication) {
        return ResponseEntity.ok(challengeService.userPlant(authentication.getName()));
    }

    // 식물 경험치 추가
    @PutMapping
    public ResponseEntity<PlantResponseDto> putMod(@RequestParam String plantName, @RequestBody PlantUpdateRequestDto plantUpdateRequestDto) {
        return ResponseEntity.ok(challengeService.updatePlant(plantName, plantUpdateRequestDto));
    }
}
