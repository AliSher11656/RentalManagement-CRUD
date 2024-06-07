package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.UsersRentedItems;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Repository("usersRentedItemsDao")
public class UsersRentedItemsDaoImpl implements UsersRentedItemsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUsersRentedItems(UsersRentedItems usersRentedItems) {
        sessionFactory.getCurrentSession().saveOrUpdate(usersRentedItems);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<UsersRentedItems> getUsersRentedItemss() {
        return (List<UsersRentedItems>) sessionFactory.getCurrentSession().createCriteria(UsersRentedItems.class).list();
    }

    @Override
    public UsersRentedItems getUsersRentedItems(int usersRentedItemsId) {
        return (UsersRentedItems) sessionFactory.getCurrentSession().get(UsersRentedItems.class, usersRentedItemsId);
    }

    @Override
    public void deleteUsersRentedItems(int usersRentedItemsId) {
        sessionFactory.getCurrentSession().createQuery("DELETE FROM UsersRequestedItems WHERE id ="+usersRentedItemsId).executeUpdate();
    }
}
