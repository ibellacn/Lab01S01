package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM USER u WHERE u.EMAIL = ?1 AND u.PASSWORD = ?2", nativeQuery = true)
    User login(String email, String password);

    @Query(value = "SELECT * FROM USER WHERE EMAIL = ?1", nativeQuery = true)
    User findByEmailAddress(String emailAddress);
}
