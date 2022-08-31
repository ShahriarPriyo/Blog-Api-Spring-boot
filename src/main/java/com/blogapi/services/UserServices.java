package com.blogapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.blogapi.repository.UserRepository;
import com.models.User;

// import antlr.collections.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
        // return users;
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user, int id) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
