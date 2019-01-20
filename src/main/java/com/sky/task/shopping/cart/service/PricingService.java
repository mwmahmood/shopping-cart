package com.sky.task.shopping.cart.service;

import java.util.List;
import java.util.stream.Collectors;

import com.sky.task.shopping.cart.domain.ShoppingCartItem;
import com.sky.task.shopping.cart.domain.enums.ItemType;

public class PricingService {

	private static final Double DISCOUNT = 0.30;

	public List<ShoppingCartItem> buildShoppingCartItems() {
		ShoppingCartItemsLoader shoppingCartItemsLoader = new ShoppingCartItemsLoader();

		List<ShoppingCartItem> shoppingItems = shoppingCartItemsLoader.loadAllShoppingItems();

		return shoppingItems.stream()
				.map(shoppingItem -> new ShoppingCartItem(shoppingItem.getItem(),
															shoppingItem.getQuantity(), 
															getDiscountedPrice(shoppingItem)))
				.collect(Collectors.toList());

	}

	Double getDiscountedPrice(ShoppingCartItem shoppingItem) {

		if (ItemType.AUDIO.equals(shoppingItem.getItem().getItemType())) {
			return shoppingItem.getQuantity() * shoppingItem.getItem().getPrice() * (1 - DISCOUNT);
		}

		if ("AAA Batteries".equals(shoppingItem.getItem().getName())) {
			Integer pricedQuantiry = shoppingItem.getQuantity() - shoppingItem.getQuantity() / 3;
			return shoppingItem.getItem().getPrice() * pricedQuantiry;
		}
		return shoppingItem.getItem().getPrice() * shoppingItem.getQuantity();
	}
}
