package com.leolab.springcloud202003demo.usercenter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @PostMapping("getUserAddress")
    String getAddress(@RequestParam(name = "username") String username) {
        log.info("getAddress({})", username);
        return "username: " + username + ", address: " + "hangzhou.";
    }
}
