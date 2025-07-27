package com.miguelbarroso.hruser.resources;

import com.miguelbarroso.hruser.entities.User;
import com.miguelbarroso.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @Autowired
    private UserRepository repository;


    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {

        User user = repository.findById(id).get();
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {

        User user = repository.findByEmail(email);
        return ResponseEntity.ok().body(user);
    }
}