package com.sky.task.shopping.cart.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.sky.task.shopping.cart.domain.Item;

/**
 * Repository to store Item data
 * Data is stored in a Map where key is the name of the Item
 * 
 * Singleton Pattern using Bill Pugh's solution
 * 
 * @author Mian Mahood
 *
 */

public class ItemRepository implements Repository<Item> {

	/**
	 * Map to hold Item Data identified by Item name
	 */
	private Map<String, Item> items = new HashMap<String, Item>();

	/**
	 * Private constructor to support Singleton Pattern
	 */
	private ItemRepository() {
	}

	/**
	 * Singleton pattern Bill Pugh's solution
	 */
	public static ItemRepository getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Collection<Item> findAll() {
		return items.values();
	}

	@Override
	public Item findByName(String name) {
		return items.get(name);
	}

	@Override
	public void save(Item item) {
		items.put(item.getName(), item);
	}
	
	@Override
	public void purge() {
		items = new HashMap<String, Item>();
	}

	/**
	 * Singleton pattern Bill Pugh's solution
	 */
	private static class SingletonHelper {
		private static final ItemRepository INSTANCE = new ItemRepository();
	}

}
