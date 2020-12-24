package com.xuesemofa.back.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/login")
public class LoginController {

    /**
     * 登录
     *
     * @param email
     * @param password
     * @return
     */

    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam("email") String email, @RequestParam("password") String password) {
        log.info("email:{}", email);
        log.info("password:{}", password);
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        return map;
    }
}
