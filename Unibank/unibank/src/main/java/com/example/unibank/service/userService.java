package com.example.unibank.service;

import com.example.unibank.model.User;

import java.util.List;

public interface userService {

    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Integer id);
    void deleteUserById(Integer id);
}
