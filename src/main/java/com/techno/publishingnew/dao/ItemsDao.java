package com.techno.publishingnew.dao;

import com.techno.publishingnew.bean.Items;

import java.util.List;

public interface ItemsDao {
    void addItems(Items items);
    List<Items> getItemss();
    Items getItems(int itemsId);
    void deleteItems(int itemsId);
}
