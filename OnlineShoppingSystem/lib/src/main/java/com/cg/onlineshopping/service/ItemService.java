package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.entities.Item;

public interface ItemService {
	
	void addItem(Item item);
	List<Item> viewAllItems();

}
