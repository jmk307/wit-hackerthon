package com.android.exercise.controller.api;

import com.android.exercise.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "android")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping
    public String test() {
        return "성공!!!!";
    }

    @PostMapping
    @ResponseBody
    public String androidResponse(@RequestBody User user) {
        logger.info("Connection from Android");
        logger.info(user.getId());
        logger.info(user.getPassword());

        return "성공!";
    }
}
