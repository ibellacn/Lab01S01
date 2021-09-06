package com.lab4.enrollmentsystem.controller;

import com.lab4.enrollmentsystem.dto.UserDTO;
import com.lab4.enrollmentsystem.model.Professor;
import com.lab4.enrollmentsystem.model.Student;
import com.lab4.enrollmentsystem.model.User;
import com.lab4.enrollmentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> list() {
        return userService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = userService.getUser(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDTO userDTO) {
        try {
            if (userDTO.getEmail().isEmpty() && userDTO.getPassword().isEmpty()){
                throw new NoSuchElementException();
            }
            User user = userService.login(userDTO.getEmail(), userDTO.getPassword());
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody UserDTO userDTO) {
        switch (userDTO.getType().toUpperCase()){
            case "SECRETARY":
                User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail(), userDTO.getPassword(),
                        userDTO.getType());
                userService.saveUser(user);
                break;
            case "PROFESSOR":
                Professor professor = new Professor(userDTO.getId(), userDTO.getName(), userDTO.getEmail(),
                        userDTO.getPassword(), userDTO.getType(), userDTO.getCpf(), userDTO.getInfo());
                userService.saveUser(professor);
                break;
            case "STUDENT":
                Student student = new Student(userDTO.getId(), userDTO.getName(), userDTO.getEmail(),
                        userDTO.getPassword(), userDTO.getType(), userDTO.getCpf());
                userService.saveUser(student);
                break;
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody UserDTO userDTO, @PathVariable Integer id) {
        try {
            User existUser = userService.getUser(id);
            userDTO.setId(id);

            switch (existUser.getType().toUpperCase()){
                case "SECRETARY":
                    User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail(), userDTO.getPassword(),
                            userDTO.getType());
                    userService.saveUser(user);
                    break;
                case "PROFESSOR":
                    Professor professor = new Professor(userDTO.getId(), userDTO.getName(), userDTO.getEmail(),
                            userDTO.getPassword(), userDTO.getType(), userDTO.getCpf(), userDTO.getInfo());
                    userService.saveUser(professor);
                    break;
                case "STUDENT":
                    Student student = new Student(userDTO.getId(), userDTO.getName(), userDTO.getEmail(),
                            userDTO.getPassword(), userDTO.getType(), userDTO.getCpf());
                    userService.saveUser(student);
                    break;
            }

            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
