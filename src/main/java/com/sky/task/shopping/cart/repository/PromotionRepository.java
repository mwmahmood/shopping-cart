package com.sky.task.shopping.cart.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.sky.task.shopping.cart.domain.Promotion;

/**
 * Repository to store Promotion data
 * Data is stored in a Map where key is the name of the Promotion
 * 
 * Singleton Pattern using Bill Pugh's solution
 * 
 * @author Mian Mahood
 *
 */

public class PromotionRepository implements Repository<Promotion> {

	/**
	 * Map to hold Promotion Data identified by Promotion name
	 */
	private Map<String, Promotion> promotions = new HashMap<String, Promotion>();

	/**
	 * Private constructor to support Singleton Pattern
	 */
	private PromotionRepository() {
	}

	/**
	 * Singleton pattern Bill Pugh's solution
	 */
	public static PromotionRepository getInstance() {
		return SingletonHelper.INSTANCE;
	}

	@Override
	public Collection<Promotion> findAll() {
		return promotions.values();
	}

	@Override
	public Promotion findByName(String name) {
		return promotions.get(name);
	}

	@Override
	public void save(Promotion promotion) {
		promotions.put(promotion.getName(), promotion);
	}
	
	@Override
	public void purge() {
		promotions = new HashMap<String, Promotion>();
	}

	/**
	 * Singleton pattern Bill Pugh's solution
	 */
	private static class SingletonHelper {
		private static final PromotionRepository INSTANCE = new PromotionRepository();
	}

}
