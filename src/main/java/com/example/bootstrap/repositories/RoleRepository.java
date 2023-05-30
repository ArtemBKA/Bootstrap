package com.example.bootstrap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bootstrap.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
