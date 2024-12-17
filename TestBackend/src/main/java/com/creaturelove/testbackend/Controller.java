package com.creaturelove.testbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User hello(@PathVariable Long id) {
        return userService.getById(id);
    }
}
