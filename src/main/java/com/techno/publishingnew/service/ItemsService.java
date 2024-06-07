package com.techno.publishingnew.service;

import com.techno.publishingnew.bean.Items;

import java.util.List;

public interface ItemsService {
    void addItems(Items items);
    List<Items> getItemss();
    Items getItems(int itemsId);
    void deleteItems(int itemsId);
}
