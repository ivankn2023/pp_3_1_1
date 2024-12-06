package org.example.pp_3_1_1.service;

import org.example.pp_3_1_1.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void editUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
}
