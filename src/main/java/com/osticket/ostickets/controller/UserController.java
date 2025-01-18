package com.osticket.ostickets.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.osticket.ostickets.model.User;
import com.osticket.ostickets.repository.UserRepository;


import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        }).orElse(ResponseEntity.notFound().build());
    }

 
}
