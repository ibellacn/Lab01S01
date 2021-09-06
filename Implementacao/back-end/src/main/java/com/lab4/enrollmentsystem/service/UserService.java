package com.lab4.enrollmentsystem.service;

import com.lab4.enrollmentsystem.model.Professor;
import com.lab4.enrollmentsystem.model.User;
import com.lab4.enrollmentsystem.repository.ProfessorRepository;
import com.lab4.enrollmentsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Iterator;
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
        User user = null;

        List<Object> response = userRepository.login(email, password);
        Iterator itr = response.iterator();
        while(itr.hasNext()){
            Object[] obj = (Object[]) itr.next();
            
           user = new User(Integer.parseInt(String.valueOf(obj[0])), String.valueOf(obj[1]), 
                    String.valueOf(obj[2]), String.valueOf(obj[3]), String.valueOf(obj[4]));
        }
        return user;
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public Professor getProfessorByCpf(String cpf) {
        Professor professor = null;
        List<Object> response = professorRepository.findByCpf(cpf);
        Iterator itr = response.iterator();
        while(itr.hasNext()){
            Object[] obj = (Object[]) itr.next();
            professor = new Professor(String.valueOf(obj[0]), String.valueOf(obj[1]));
        }
        return professor;
    }
}
