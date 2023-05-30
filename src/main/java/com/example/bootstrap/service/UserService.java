package com.example.bootstrap.service;

import com.example.bootstrap.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void createNewUser(User user);
    User getUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    User findUserByUsername(String username);
}
