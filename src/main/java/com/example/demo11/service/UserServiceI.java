package com.example.demo11.service;

import com.example.demo11.model.User;

import java.util.List;

public interface UserServiceI {

    // create
    User createUser (User user);

    // update
    User updateUser(User user,Long userId);

    //get single data
    User getSingleUser(Long userId);

    //get all data
    List<User> getAllUser();

    List<User> getAllUsers();

    //delete
    void deleteUser(Long userId);
}
