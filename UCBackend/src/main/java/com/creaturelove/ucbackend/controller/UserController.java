package com.creaturelove.ucbackend.controller;

import com.creaturelove.ucbackend.db.entity.User;
import com.creaturelove.ucbackend.model.request.RegisterBody;
import com.creaturelove.ucbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }


    @PostMapping("/register")
    @ResponseStatus(value = HttpStatus.OK)
    public void register(@RequestBody() RegisterBody body) {
        userService.register(body.username(), body.password(), body.firstName(), body.lastName());
    }
}