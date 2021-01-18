package com.example.demo;

import com.example.demo.database.User;
import com.example.demo.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired private UserRepository userRepository;

    @GetMapping("/hello")
    public HelloWorld hello(@RequestParam(defaultValue = "World") Visitor visitor) {
        return new HelloWorld(visitor.getName());
    }

    @GetMapping("/register")
    public String register(@RequestParam String name) {
        List<User> users = userRepository.findAllByName(name);

        if(users.isEmpty()) {
            return "Member registered: " + userRepository.save(new User(name));
        }
        return "Member already existed: " + users;
    }

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }
}
