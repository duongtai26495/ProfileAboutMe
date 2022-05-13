package com.profile.aboutme.controllers;

import com.profile.aboutme.entities.ResponseObject;
import com.profile.aboutme.entities.Social;
import com.profile.aboutme.entities.User;
import com.profile.aboutme.services.Impls.ProfileImageServiceImpl;
import com.profile.aboutme.services.Impls.SocialServiceImpl;
import com.profile.aboutme.services.Impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@CrossOrigin
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private ProfileImageServiceImpl profileImageService;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    SocialServiceImpl socialService;

    @PutMapping("edit/{username}")
    public ResponseEntity<ResponseObject> editByUsername(@PathVariable String username, @RequestBody User user){
        user.setUsername(username);
        return userService.editByUsername(user);
    }

    @PutMapping("change_password")
    public ResponseEntity<ResponseObject> updatePasswordByUsername(@RequestBody User user){
        return userService.updatePassword(user.getPassword());
    }

    @PostMapping("uploadImage")
    public ResponseEntity<ResponseObject> uploadImage(@RequestParam("image") MultipartFile file){
        return profileImageService.storeFile(file);
    }

    @PostMapping("add/social")
    public Social addSocial(@RequestBody Social social){
        return socialService.saveNewSocial(social);
    }
}
