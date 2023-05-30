package com.example.bootstrap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.bootstrap.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>   {
    @Query("select u from User u where u.username = :userName")
    User findByUsername(@Param("userName") String userName);
}
