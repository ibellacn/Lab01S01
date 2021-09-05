package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    @Query(value = "SELECT * FROM PROFESSOR WHERE CPF = ?1", nativeQuery = true)
    Professor findByCpf(String cpf);
}
