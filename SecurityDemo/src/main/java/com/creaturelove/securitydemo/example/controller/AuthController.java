package com.creaturelove.securitydemo.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        // 验证用户并生成 JWT
        String jwt = generateJwtToken(request);
        return jwt;
    }

    private String generateJwtToken(LoginRequest request) {
        // 使用 JWT 库生成令牌
        // ...
        return token;
    }
} 