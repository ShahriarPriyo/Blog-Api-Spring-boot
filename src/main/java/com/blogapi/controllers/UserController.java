package com.blogapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.models.User;
import com.blogapi.services.UserServices;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @RequestMapping("/users")
    public Iterable<User> getAllUsers() {
        return userServices.getAllUsers();
    }

    @RequestMapping("users/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userServices.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user) {
        userServices.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable int id) {
        userServices.updateUser(user, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userServices.deleteUser(id);
    }

}
