package com.profile.aboutme.services.Impls;

import com.profile.aboutme.entities.Role;
import com.profile.aboutme.repositories.RoleRepository;
import com.profile.aboutme.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }

    @Override
    public boolean isExistByName(String name) {
        List<Role> roleList = roleRepository.findAll();
        for(Role role : roleList){
            if (role.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
