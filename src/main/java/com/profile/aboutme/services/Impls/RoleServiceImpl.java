package com.profile.aboutme.services.Impls;

import com.profile.aboutme.entities.Role;
import com.profile.aboutme.repositories.RoleRepository;
import com.profile.aboutme.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }
}
