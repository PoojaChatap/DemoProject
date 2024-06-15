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
    public User createUser(User user){
        User savedUser= userRepository.save(user);
        return savedUser;
    }

    @Override
    public User updateUser(User user, Long userId) {
        User user1 = userRepository.findById(userId).get();

        user1.setUserName(user.getUserName());
        user1.setUserAge(user.getUserAge());
        user1.setAbout(user.getAbout());
        User updateUser = userRepository.save(user1);
        return updateUser;
    }

    @Override
    public User getSingleUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->new RuntimeException("Resource not found on server!!"));
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return allUsers;
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Resource not found on server!!" + userId));
        userRepository.delete(user);

    }
}
