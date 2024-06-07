package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.Items;
import com.techno.publishingnew.dao.ItemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("itemsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addItems(Items items) {
        itemsDao.addItems(items);
    }
    @Override
    public List<Items> getItemss() {
        return itemsDao.getItemss();
    }

    @Override
    public Items getItems(int itemsId) {
        return itemsDao.getItems(itemsId);
    }

    @Override
    public void deleteItems(int itemsId) {
        itemsDao.deleteItems(itemsId);
    }
}
