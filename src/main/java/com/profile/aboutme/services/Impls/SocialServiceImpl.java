package com.profile.aboutme.services.Impls;

import com.profile.aboutme.entities.ResponseObject;
import com.profile.aboutme.entities.Social;
import com.profile.aboutme.entities.User;
import com.profile.aboutme.entities.UsernameLogin;
import com.profile.aboutme.repositories.SocialRepository;
import com.profile.aboutme.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SocialServiceImpl implements SocialService {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private SocialRepository socialRepository;

    @Override
    public Social saveNewSocial(Social social) {
        User user = userService.findByUsername(UsernameLogin.getUsernameLogin());
        social.setUser(user);
        return socialRepository.save(social);
    }
}
