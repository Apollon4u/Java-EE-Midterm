package com.example.MidTermProject.dao;

import com.example.MidTermProject.models.User;

import java.util.ArrayList;

public class UserDAO {

    private static UserDAO instance;
    private ArrayList<User> users;

    private UserDAO() {
        this.users = new ArrayList<>();
    }

    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username))
                return user;
        }
        return null;
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email))
                return user;
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
