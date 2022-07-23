package com.android.exercise.controller.api;

import com.android.exercise.dto.EnvTest.EnvTestResponseDto;
import com.android.exercise.service.EnvTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "tests")
public class EnvTestApiController {
    private final EnvTestService envTestService;

    // 환경보호 성향 테스트
    @GetMapping("{step}")
    public ResponseEntity<EnvTestResponseDto> test(@PathVariable Long step) {
        return ResponseEntity.ok(envTestService.getTestOne(step));
    }
}
