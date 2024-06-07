package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.UsersRentedItems;
import com.techno.publishingnew.dao.UsersRentedItemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("usersRentedItemsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UsersRentedItemsServiceImpl implements UsersRentedItemsService {

    @Autowired
    private UsersRentedItemsDao usersRentedItemsDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addUsersRentedItems(UsersRentedItems usersRentedItems) {
        usersRentedItemsDao.addUsersRentedItems(usersRentedItems);
    }
    @Override
    public List<UsersRentedItems> getUsersRentedItemss() {
        return usersRentedItemsDao.getUsersRentedItemss();
    }

    @Override
    public UsersRentedItems getUsersRentedItems(int usersRentedItemsId) {
        return usersRentedItemsDao.getUsersRentedItems(usersRentedItemsId);
    }

    @Override
    public void deleteUsersRentedItems(int usersRentedItemsId) {
        usersRentedItemsDao.deleteUsersRentedItems(usersRentedItemsId);
    }
}
