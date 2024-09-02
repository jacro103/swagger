package com.example.swagger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users/")
public class UserController {
    @RequestMapping
    public String hello() {
        return "API working OK!";
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
    }

}
