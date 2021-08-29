package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
