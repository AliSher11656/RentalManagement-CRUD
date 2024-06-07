package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.Users;
import com.techno.publishingnew.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("usersService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addUsers(Users users) {
        usersDao.addUsers(users);
    }
    @Override
    public List<Users> getUserss() {
        return usersDao.getUserss();
    }

    @Override
    public Users getUsers(int usersId) {
        return usersDao.getUsers(usersId);
    }

    @Override
    public void deleteUsers(int usersId) {
        usersDao.deleteUsers(usersId);
    }

    @Override
    public Users findByEmail(String email) {
        return usersDao.findByEmail(email);
    }
}
