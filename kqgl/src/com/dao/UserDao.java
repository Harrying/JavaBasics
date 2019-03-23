package com.dao;

import com.eneity.User;

import java.util.List;

public interface UserDao {
    boolean addUser(User user);
    boolean deleteUser(User user);
    boolean updateUser(int id, User user);
    List<User> selectUser();
    List<User> selectOneUser(User user);
}
