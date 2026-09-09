package com.aulaSpring.course.resources;


import com.aulaSpring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> response = new ArrayList<>();
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");

        response.add(u);

        return ResponseEntity.ok().body(response);

    }
}
