package com.study.docker.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {


    @GetMapping("/login")
    public String login() {
        log.info("hello");
        return "login";
    }

}
