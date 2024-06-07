package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.UsersRequestedItems;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Repository("usersRequestedItemsDao")
public class UsersRequestedItemsDaoImpl implements UsersRequestedItemsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUsersRequestedItems(UsersRequestedItems usersRequestedItems) {
        sessionFactory.getCurrentSession().saveOrUpdate(usersRequestedItems);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UsersRequestedItems> getUsersRequestedItemss() {
        return (List<UsersRequestedItems>) sessionFactory.getCurrentSession().createCriteria(UsersRequestedItems.class).list();
    }

    @Override
    public UsersRequestedItems getUsersRequestedItems(int usersRequestedItemsId) {
        return (UsersRequestedItems) sessionFactory.getCurrentSession().get(UsersRequestedItems.class, usersRequestedItemsId);
    }

    @Override
    public void deleteUsersRequestedItems(int usersRequestedItemsId) {
        sessionFactory.getCurrentSession().createQuery("DELETE FROM UsersRequestedItems WHERE id ="+usersRequestedItemsId).executeUpdate();
    }
}
