package com.kp.dev.usefulsolutions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
public class SimpleController {

    @GetMapping("")
    public String sayHallo() {
        return "Hallo!!!";
    }

    @GetMapping("/{name}")
    public String sayHi(@PathVariable String name) {
        return "Hi " + name;
    }
}
