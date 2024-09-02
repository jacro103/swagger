package com.example.swagger.service;

import com.example.swagger.controller.User;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class UserServiceImpl implements  UserService {
    private final Map<String, User> userRepository = new HashMap<>();

    @Override
    public User createUser(User user) {
        userRepository.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> getUserById(String id) {
        return Optional.ofNullable(userRepository.get(id));
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userRepository.values());
    }

    @Override
    public User updateUser(String id, User user) {
        if (userRepository.containsKey(id)) {
            userRepository.put(id, user);
            return user;
        }
        return null;
    }

    @Override
    public void deleteUser(String id) {
        userRepository.remove(id);
    }
}
