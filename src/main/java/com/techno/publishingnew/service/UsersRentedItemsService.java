package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.UsersRentedItems;

import java.util.List;

public interface UsersRentedItemsService {
    void addUsersRentedItems(UsersRentedItems usersRentedItems);
    List<UsersRentedItems> getUsersRentedItemss();
    UsersRentedItems getUsersRentedItems(int usersRentedItemsId);
    void deleteUsersRentedItems(int usersRentedItemsId);
}
