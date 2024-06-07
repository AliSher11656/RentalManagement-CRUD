package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Repository("usersDao")
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUsers(Users users) {
        sessionFactory.getCurrentSession().saveOrUpdate(users);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Users> getUserss() {
        return (List<Users>) sessionFactory.getCurrentSession().createCriteria(Users.class).list();
    }

    @Override
    public Users getUsers(int usersId) {
        return (Users) sessionFactory.getCurrentSession().get(Users.class, usersId);
    }

    @Override
    public void deleteUsers(int usersId) {
        sessionFactory.getCurrentSession().createQuery("DELETE FROM Users WHERE id ="+usersId).executeUpdate();
    }

    public Users findByEmail(String email) {
        String hql = "FROM Users WHERE email = :email";
        return (Users) sessionFactory.getCurrentSession()
                .createQuery(hql)
                .setParameter("email", email)
                .uniqueResult();
    }
}
