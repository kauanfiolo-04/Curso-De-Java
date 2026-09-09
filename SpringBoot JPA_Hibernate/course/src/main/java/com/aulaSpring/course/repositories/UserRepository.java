package com.aulaSpring.course.repositories;

import com.aulaSpring.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // opcional pois a classe herda de JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

}
