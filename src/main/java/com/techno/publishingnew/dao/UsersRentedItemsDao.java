package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.UsersRentedItems;

import java.util.List;

public interface UsersRentedItemsDao {
    void addUsersRentedItems(UsersRentedItems usersRentedItems);
    List<UsersRentedItems> getUsersRentedItemss();
    UsersRentedItems getUsersRentedItems(int usersRentedItemsId);
    void deleteUsersRentedItems(int usersRentedItemsId);
}
