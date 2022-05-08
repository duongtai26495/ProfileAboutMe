package com.profile.aboutme.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PublicController {


    @GetMapping("")
    public String homePage(){
        return "Hello, welcome to About Me";
    }

}
