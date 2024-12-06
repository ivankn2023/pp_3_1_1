package org.example.pp_3_1_1.service;

import org.example.pp_3_1_1.dao.UserDao;
import org.example.pp_3_1_1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Transactional
    @Override
    public void editUser(User user) {

        userDao.editUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {

        userDao.deleteUser(id);
    }
}