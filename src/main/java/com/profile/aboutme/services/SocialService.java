package com.profile.aboutme.services;

import com.profile.aboutme.entities.ResponseObject;
import com.profile.aboutme.entities.Social;
import org.springframework.http.ResponseEntity;

public interface SocialService {
    Social saveNewSocial(Social social);
}
