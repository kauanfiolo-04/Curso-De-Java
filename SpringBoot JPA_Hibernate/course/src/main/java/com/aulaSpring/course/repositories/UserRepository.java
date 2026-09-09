package com.aulaSpring.course.repositories;

import com.aulaSpring.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
