package com.manish.easyrent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        return userRepository.findByEmail(user.getEmail())
                .map(existingUser -> {
                    if (existingUser.getPassword().equals(user.getPassword())) {
                        return ResponseEntity.ok(existingUser);
                    } else {
                        return ResponseEntity.badRequest().body("Invalid Password!");
                    }
                }).orElse(ResponseEntity.badRequest().body("User Not Found!"));
    }
}