package com.example.demo;

import lombok.Getter;

@Getter
public class HelloWorld {
    private final String HELLO_TEMPLATE_ENG = "Hello, %s!";

    private String hello;

    public HelloWorld(String username) {
        this.hello = String.format(HELLO_TEMPLATE_ENG, username);
    }
}
