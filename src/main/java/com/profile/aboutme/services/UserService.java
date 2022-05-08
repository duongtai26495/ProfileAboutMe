package com.profile.aboutme.services;

import com.profile.aboutme.entities.ResponseObject;
import com.profile.aboutme.entities.User;
import com.profile.aboutme.entities.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    User findByUsername(String username);

    User findByEmail(String email);

    UserDTO getUserByUsername(String username);

    ResponseEntity<ResponseObject> saveUser(User user);

    ResponseEntity<ResponseObject> getById(Long id);

    ResponseEntity<ResponseObject> editByUsername(User user);

    ResponseEntity<ResponseObject> updatePassword(String newPassword);

}
