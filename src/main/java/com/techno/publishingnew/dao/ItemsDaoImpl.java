package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.Items;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@Repository("itemsDao")
public class ItemsDaoImpl implements ItemsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addItems(Items items) {
        sessionFactory.getCurrentSession().saveOrUpdate(items);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Items> getItemss() {
        return (List<Items>) sessionFactory.getCurrentSession().createCriteria(Items.class).list();
    }

    @Override
    public Items getItems(int itemsId) {
        return (Items) sessionFactory.getCurrentSession().get(Items.class, itemsId);
    }

    @Override
    public void deleteItems(int itemsId) {
        sessionFactory.getCurrentSession().createQuery("DELETE FROM Items WHERE id ="+itemsId).executeUpdate();
    }
}
