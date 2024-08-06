package com.nghbui.sb_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String home() {
        return "<h1>Hello world</h1>";
    }
}
