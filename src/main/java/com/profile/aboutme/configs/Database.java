package com.profile.aboutme.configs;

import com.profile.aboutme.entities.Role;
import com.profile.aboutme.entities.SocialType;
import com.profile.aboutme.repositories.RoleRepository;
import com.profile.aboutme.repositories.SocialTypeRepository;
import com.profile.aboutme.services.Impls.RoleServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(RoleRepository roleRepository, RoleServiceImpl roleService, SocialTypeRepository socialTypeRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                List<SocialType> socialTypes = new ArrayList<>();
                List<Role> roles = new ArrayList<>();
                roles.add(new Role("ROLE_USER"));
                roles.add(new Role("ROLE_ADMIN"));
                socialTypes.add(new SocialType("fb", "Facebook"));
                socialTypes.add(new SocialType("tw", "Twitter"));
                socialTypes.add(new SocialType("insta", "Instagram"));
                socialTypes.add(new SocialType("telegram", "Telegram"));
                socialTypes.add(new SocialType("zalo", "Zalo"));
                socialTypes.add(new SocialType("linkedIn", "Linked In"));
                socialTypes.add(new SocialType("flickr", "Flickr"));
                socialTypes.add(new SocialType("messenger", "Messenger"));

                for (SocialType socialType: socialTypes) {
                    socialTypeRepository.save(socialType);
                }

                for(Role role : roles){
                    if(!roleService.isExistByName(role.getName())){
                        roleRepository.save(role);
                    }else{
                        System.out.println("Role: "+role.getName()+" is already exist");
                    }
                }
            }
        };
    }
}
