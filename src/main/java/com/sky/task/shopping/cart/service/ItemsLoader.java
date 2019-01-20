package com.sky.task.shopping.cart.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sky.task.shopping.cart.domain.Item;
import com.sky.task.shopping.cart.domain.enums.ItemType;

public class ItemsLoader {
	Map<String, Item> loadAllItems() {
		List<Item> items = Arrays.asList(
				new Item("Headphones", ItemType.AUDIO, 150.00),
				new Item("Speakers", ItemType.AUDIO, 85.00), 
				new Item("AAA Batteries", ItemType.POWER, 0.85),
				new Item("Protein Bars", ItemType.FOOD, 25.00));

		return items.stream()
				.collect(Collectors.toMap(Item::getName, item -> item));
	}
}
