package com.profile.aboutme.controllers;

import com.profile.aboutme.entities.ResponseObject;
import com.profile.aboutme.entities.User;
import com.profile.aboutme.entities.UserDTO;
import com.profile.aboutme.services.Impls.ProfileImageServiceImpl;
import com.profile.aboutme.services.Impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/")
public class HomController {

    @Autowired
    private ProfileImageServiceImpl profileImageService;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("")
    public String homePage(){
        return "Hello, welcome to Sydiary";
    }

    @PostMapping("uploadImage")
    public ResponseEntity<ResponseObject> uploadImage(@RequestParam("image") MultipartFile file){
        return profileImageService.storeFile(file);
    }

    @GetMapping("images/{fileName:.+}")
    public ResponseEntity<byte[]> readFile (@PathVariable String fileName){
        return profileImageService.readFile(fileName);
    }

    @GetMapping("logoutSuccess")
    public String logoutSuccess(){
        return "Success";
    }

    @GetMapping("profile/{username}")
    public UserDTO getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }

    @PostMapping("register")
    public ResponseEntity<ResponseObject> createUser (@RequestBody User user){
        return userService.saveUser(user);
    }
}
