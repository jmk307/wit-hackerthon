package com.android.exercise.dto.EnvTest;

import com.android.exercise.domain.EnvTest;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EnvTestResponseDto {
    private Long testId;

    private String question;

    private String answer1;

    private String answer2;

    private String answer3;

    private Long step;

    public EnvTestResponseDto(EnvTest envTest) {
        this.testId = envTest.getTestId();
        this.question = envTest.getQuestion();
        this.answer1 = envTest.getAnswer1();
        this.answer2 = envTest.getAnswer2();
        this.answer3 = envTest.getAnswer3();
        this.step = envTest.getStep();
    }
}
