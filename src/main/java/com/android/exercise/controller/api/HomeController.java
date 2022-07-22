package com.android.exercise.controller.api;

import com.android.exercise.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "android")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @PostMapping
    public String androidResponse(@RequestBody User user) {
        logger.info("Connection from Android");
        logger.info("id: " + user.getId() + ", pw: " + user.getPassword());

        return "1";
    }
}
