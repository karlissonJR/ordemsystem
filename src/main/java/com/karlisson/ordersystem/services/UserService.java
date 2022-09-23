package com.karlisson.ordersystem.services;

import com.karlisson.ordersystem.entities.User;
import com.karlisson.ordersystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

}
