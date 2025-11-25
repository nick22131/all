package com.example.ecommerce.service;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        // In a real app, hash password here
        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public Optional<User> findByUsername(String username) {
        // Placeholder for future implementation
        return userRepository.findAll().stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
    }
}
