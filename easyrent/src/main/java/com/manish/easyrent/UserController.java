package com.manish.easyrent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public Object loginUser(@RequestBody User user) {
        return userRepository.findByEmail(user.getEmail())
                .map(existingUser -> {
                    if (existingUser.getPassword().equals(user.getPassword())) {
                        return existingUser; // Pura User object return karo
                    } else {
                        return "Invalid Password!";
                    }
                }).orElse("User Not Found!");
    }
}