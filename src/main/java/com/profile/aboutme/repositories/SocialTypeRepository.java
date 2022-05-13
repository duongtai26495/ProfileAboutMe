package com.profile.aboutme.repositories;

import com.profile.aboutme.entities.SocialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialTypeRepository extends JpaRepository<SocialType, String> {
}
