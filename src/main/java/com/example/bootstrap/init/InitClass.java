package com.example.bootstrap.init;

import com.example.bootstrap.service.RoleService;
import com.example.bootstrap.service.UserService;
import org.springframework.stereotype.Component;
import com.example.bootstrap.model.Role;
import com.example.bootstrap.model.User;
import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitClass {
    private final RoleService roleService;
    private final UserService userService;

    public InitClass(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        Role roleUser = new Role("ROLE_USER");
        Set<Role> adminRoles = new HashSet<>();
        Set<Role> userRoles = new HashSet<>();

        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);
        adminRoles.add(roleAdmin);
        adminRoles.add(roleUser);
        userRoles.add(roleUser);

        User userAdmin = new User("admin", "admin",  "admin@mail.ru", 100,  "admin", adminRoles);
        User userUser = new User("user", "user",  "user@mail.ru", 100,  "user", userRoles);
        System.out.println(userAdmin);
        userService.createNewUser(userAdmin);
        System.out.println(userUser);
        userService.createNewUser(userUser);
    }
}
