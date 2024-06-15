package com.example.demo11.controller;


import com.example.demo11.model.User;
import com.example.demo11.service.UserServiceI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserServiceI userServiceI;

    @PostMapping("/")
    public ResponseEntity<User> createUser(){
        return null;
    }

}
