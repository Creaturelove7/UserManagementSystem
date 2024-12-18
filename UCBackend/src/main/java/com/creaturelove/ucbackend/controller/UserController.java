package com.creaturelove.ucbackend.controller;

import com.creaturelove.ucbackend.db.entity.UserEntity;
import com.creaturelove.ucbackend.db.repository.UserRepository;
import com.creaturelove.ucbackend.model.request.RegisterBody;
import com.creaturelove.ucbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/list")
    public List<UserEntity> getList(){
        return userService.getAllUser();
    }


    @PostMapping("/register")
    @ResponseStatus(value = HttpStatus.OK)
    public void register(@RequestBody() RegisterBody body) {
        userService.register(body.username(), body.password());
    }


}