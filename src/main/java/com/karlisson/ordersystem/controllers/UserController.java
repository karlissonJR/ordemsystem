package com.karlisson.ordersystem.controllers;

import com.karlisson.ordersystem.entities.User;
import com.karlisson.ordersystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = userService.insert(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
        User user = userService.update(id, obj);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
