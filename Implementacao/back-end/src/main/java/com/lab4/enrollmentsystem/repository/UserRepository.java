package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT ID, NAME, EMAIL, PASSWORD, TYPE FROM USER u WHERE u.EMAIL = ?1 AND u.PASSWORD = ?2", nativeQuery = true)
    List<Object> login(String email, String password);

    @Query(value = "SELECT * FROM USER WHERE EMAIL = ?1", nativeQuery = true)
    User findByEmailAddress(String emailAddress);
}
