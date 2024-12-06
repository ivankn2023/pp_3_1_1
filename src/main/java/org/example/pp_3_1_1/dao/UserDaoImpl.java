package org.example.pp_3_1_1.dao;

import jakarta.persistence.EntityManager;
import org.example.pp_3_1_1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private EntityManager entityManager;


    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUsers() {

        return entityManager.createQuery(" FROM User").getResultList();

    }

    @Override
    public void editUser(User user) {

        User editable = entityManager.find(User.class, user.getId());
        editable.setName(user.getName());
        editable.setSurname(user.getSurname());
        editable.setAge(user.getAge());
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
