package com.aulaSpring.course.services;

import com.aulaSpring.course.entities.User;
import com.aulaSpring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> userOpt = userRepository.findById(id);

        return userOpt.get();
    }
}
