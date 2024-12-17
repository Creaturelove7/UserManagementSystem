package com.creaturelove.ucbackend.service;

import com.creaturelove.ucbackend.db.entity.User;
import com.creaturelove.ucbackend.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(Integer id){
        return userRepository.findUserById(id);
    }

    public void register(String username, String password, String firstName, String lastName){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userRepository.save(user);
    }
}
