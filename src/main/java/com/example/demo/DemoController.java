package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public HelloWorld hello(@RequestParam(defaultValue = "World") User user) {
        return new HelloWorld(user.getName());
    }
}
