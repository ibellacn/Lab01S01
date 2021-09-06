package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    @Query(value = "SELECT * FROM PROFESSOR p WHERE p.CPF = ?1", nativeQuery = true)
    List<Object> findByCpf(String cpf);
}
