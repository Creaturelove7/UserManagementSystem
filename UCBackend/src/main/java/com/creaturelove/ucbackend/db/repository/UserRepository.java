package com.creaturelove.ucbackend.db.repository;

import com.creaturelove.ucbackend.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(Integer id);

    User findUserByUsername(String username);
} 