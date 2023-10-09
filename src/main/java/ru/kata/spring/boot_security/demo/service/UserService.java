package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Component
public interface UserService {

    User findUserById(Long id);
    List<User> allUsers();
    void saveUser(User user);
    void deleteUser(Long id);
    void update (User user);

    User findByUsername (String username);
}