package com.manish.easyrent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Registration API
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Login API
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        return userRepository.findByEmail(user.getEmail())
                .map(existingUser -> {
                    if (existingUser.getPassword().equals(user.getPassword())) {
                        return "Login Successful!";
                    } else {
                        return "Invalid Password!";
                    }
                }).orElse("User Not Found!");
    }
}