package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.Users;

import java.util.List;

public interface UsersDao {
    void addUsers(Users users);
    List<Users> getUserss();
    Users getUsers(int usersId);
    void deleteUsers(int usersId);
    Users findByEmail(String email);

}
