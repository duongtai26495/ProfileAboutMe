package com.profile.aboutme.services;

import com.profile.aboutme.entities.Role;

public interface RoleService {
    Role saveNewRole(Role role);
    Role getRoleByName(String name);
}
