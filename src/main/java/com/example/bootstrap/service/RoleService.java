package com.example.bootstrap.service;

import com.example.bootstrap.model.Role;
import java.util.List;

public interface RoleService {
    Role findRoleOfId(Long id);
    List<Role> getAllRoles();
    List<Role> getUniqAllRoles();
    void addRole(Role role);
}
