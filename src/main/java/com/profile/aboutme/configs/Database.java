package com.profile.aboutme.configs;

import com.profile.aboutme.entities.Role;
import com.profile.aboutme.services.Impls.RoleServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(RoleServiceImpl roleService){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Role role_user = new Role("ROLE_USER");
                Role role_admin = new Role("ROLE_ADMIN");
                roleService.saveNewRole(role_user);
                roleService.saveNewRole(role_admin);
            }
        };
    }
}
