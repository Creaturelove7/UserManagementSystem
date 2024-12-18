package com.creaturelove.ucbackend.db.repository;

import com.creaturelove.ucbackend.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findUserById(Integer id);

    UserEntity findUserByUsername(String username);
} 