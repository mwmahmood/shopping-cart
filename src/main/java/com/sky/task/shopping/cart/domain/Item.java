package com.sky.task.shopping.cart.domain;

import com.sky.task.shopping.cart.domain.enums.ItemType;

public class Item {
	
	private String name;
	private ItemType itemType;
	private Double price;
	
	public Item(String name, ItemType itemType, Double price) {
		this.name = name;
		this.itemType = itemType;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public Double getPrice() {
		return price;
	}	
}
