package com.creaturelove.ucbackend.service;

import com.creaturelove.ucbackend.db.entity.UserEntity;
import com.creaturelove.ucbackend.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDetailsManager userDetailsManager;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserEntity getUserById(Integer id){
        return userRepository.findUserById(id);
    }

    public void register(String username, String password){
        UserDetails user = User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .roles("USER")
                .build();
        userDetailsManager.createUser(user);
    }

    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }
}
