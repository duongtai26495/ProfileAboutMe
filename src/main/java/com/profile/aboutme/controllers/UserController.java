package com.profile.aboutme.controllers;

import com.profile.aboutme.entities.ResponseObject;
import com.profile.aboutme.entities.User;
import com.profile.aboutme.services.Impls.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PutMapping("edit/{username}")
    public ResponseEntity<ResponseObject> editByUsername(@PathVariable String username, @RequestBody User user){
        user.setUsername(username);
        return userService.editByUsername(user);
    }

    @PutMapping("change_password")
    public ResponseEntity<ResponseObject> updatePasswordByUsername(@RequestBody User user){
        return userService.updatePassword(user.getPassword());
    }

}
