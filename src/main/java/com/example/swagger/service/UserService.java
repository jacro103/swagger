package com.example.swagger.service;

import com.example.swagger.controller.User;

import java.util.List;
import java.util.Optional;

public interface  UserService {
    User createUser(User user);
    Optional<User> getUserById(String id);
    List<User> getAllUsers();
    User updateUser(String id, User user);
    void deleteUser(String id);
}
