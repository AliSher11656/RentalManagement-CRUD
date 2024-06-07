package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.UsersRequestedItems;

import java.util.List;

public interface UsersRequestedItemsService {
    void addUsersRequestedItems(UsersRequestedItems usersRequestedItems);
    List<UsersRequestedItems> getUsersRequestedItemss();
    UsersRequestedItems getUsersRequestedItems(int usersRequestedItemsId);
    void deleteUsersRequestedItems(int usersRequestedItemsId);
}
