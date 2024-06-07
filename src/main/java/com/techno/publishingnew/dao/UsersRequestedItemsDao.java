package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.UsersRequestedItems;

import java.util.List;

public interface UsersRequestedItemsDao {
    void addUsersRequestedItems(UsersRequestedItems usersRequestedItems);
    List<UsersRequestedItems> getUsersRequestedItemss();
    UsersRequestedItems getUsersRequestedItems(int usersRequestedItemsId);
    void deleteUsersRequestedItems(int usersRequestedItemsId);
}
