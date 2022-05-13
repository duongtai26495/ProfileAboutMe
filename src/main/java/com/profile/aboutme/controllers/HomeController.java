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

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class HomeController {

    @Autowired
    private ProfileImageServiceImpl profileImageService;

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("images/{fileName:.+}")
    public ResponseEntity<byte[]> readFile (@PathVariable String fileName){
        return profileImageService.readFile(fileName);
    }

    @GetMapping("logoutSuccess")
    public String logoutSuccess(){
        return "Success";
    }

    @PostMapping("register")
    public ResponseEntity<ResponseObject> createUser (@RequestBody User user){
        return userService.saveUser(user);
    }
}
