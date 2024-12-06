package org.example.pp_3_1_1.dao;

import org.example.pp_3_1_1.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();
    void editUser(User user);
    void deleteUser(int id);
}

