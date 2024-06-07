package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.Users;

import java.util.List;

public interface UsersService {
    void addUsers(Users users);
    List<Users> getUserss();
    Users getUsers(int usersId);
    void deleteUsers(int usersId);
    Users findByEmail(String email);

}
