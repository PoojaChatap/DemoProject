package com.example.demo11.service.impl;

import com.example.demo11.model.User;
import com.example.demo11.repository.UserRepository;
import com.example.demo11.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserRepository userRepository;
    //field dependency injection

    @Override
    public User createUser(User user) {
        User savedUser= userRepository.save(user);
        return savedUser;
    }

    @Override
    public User updateUser(User user, Long userId) {
        return null;
    }

    @Override
    public User getSingleUser(Long userId) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
