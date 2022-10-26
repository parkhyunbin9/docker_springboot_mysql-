package com.study.docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberController {

    @GetMapping("/hello")
    public String test() {
        log.info("hello");
        return "test Success";
    }
}
