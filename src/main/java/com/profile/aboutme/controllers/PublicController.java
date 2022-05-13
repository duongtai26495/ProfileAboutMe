package com.profile.aboutme.controllers;

import com.profile.aboutme.entities.UserDTO;
import com.profile.aboutme.services.Impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PublicController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("")
    public String homePage(){
        return "Hello, welcome to About Me";
    }


    @GetMapping("{username}")
    public UserDTO getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }

}
