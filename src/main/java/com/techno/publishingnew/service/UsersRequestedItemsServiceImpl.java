package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.UsersRequestedItems;
import com.techno.publishingnew.dao.UsersRequestedItemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("usersRequestedItemsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UsersRequestedItemsServiceImpl implements UsersRequestedItemsService {

    @Autowired
    private UsersRequestedItemsDao usersRequestedItemsDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addUsersRequestedItems(UsersRequestedItems usersRequestedItems) {
        usersRequestedItemsDao.addUsersRequestedItems(usersRequestedItems);
    }
    @Override
    public List<UsersRequestedItems> getUsersRequestedItemss() {
        return usersRequestedItemsDao.getUsersRequestedItemss();
    }

    @Override
    public UsersRequestedItems getUsersRequestedItems(int usersRequestedItemsId) {
        return usersRequestedItemsDao.getUsersRequestedItems(usersRequestedItemsId);
    }

    @Override
    public void deleteUsersRequestedItems(int usersRequestedItemsId) {
        usersRequestedItemsDao.deleteUsersRequestedItems(usersRequestedItemsId);
    }
}
