package com.profile.aboutme.repositories;

import com.profile.aboutme.entities.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository<Social, Long> {
}
