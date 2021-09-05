package com.lab4.enrollmentsystem.service;

import com.lab4.enrollmentsystem.model.Professor;
import com.lab4.enrollmentsystem.model.User;
import com.lab4.enrollmentsystem.repository.ProfessorRepository;
import com.lab4.enrollmentsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    public List<User> listAllUser(){
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public User login(String email, String password) {
        User login = userRepository.login(email, password);
        return login;
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public Professor getProfessor(String cpf) {
        return professorRepository.findByCpf(cpf);
    }
}
