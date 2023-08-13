package com.example.jwt.controllers;

import com.example.jwt.models.User;
import com.example.jwt.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {

//    localhost:8080/home/user
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


//    localhost:8080/home/current-user
    //To find the current user
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
