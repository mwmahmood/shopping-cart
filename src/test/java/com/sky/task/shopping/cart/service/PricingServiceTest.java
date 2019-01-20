package com.sky.task.shopping.cart.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sky.task.shopping.cart.domain.Item;
import com.sky.task.shopping.cart.domain.ShoppingCartItem;
import com.sky.task.shopping.cart.domain.enums.ItemType;

public class PricingServiceTest {

	@Test
	public void testBuildShoppingCartItems() {
		PricingService service = new PricingService();

		List<ShoppingCartItem> shoppingItems = service.buildShoppingCartItems();
		
		Double discountedTotalPrice = shoppingItems.stream()
				.mapToDouble(ShoppingCartItem::getDiscountedPrice)
				.sum();
		assertEquals (112.9, discountedTotalPrice, 0.001);
		
		Double totalPrice = shoppingItems.stream()
				.mapToDouble(shoppingCartItem -> shoppingCartItem.getQuantity() * shoppingCartItem.getItem().getPrice())
				.sum();

		assertEquals (139.25, totalPrice, 0.001);
	}

	@Test
	public void testGetDiscountedPriceForSpeakers() {

		PricingService service = new PricingService();

		Item speaker = new Item("Speakers", ItemType.AUDIO, 85.0);

		ShoppingCartItem shoppingItem = new ShoppingCartItem(speaker, 1);

		assertEquals(59.5, service.getDiscountedPrice(shoppingItem), 0.001);
	}

	@Test
	public void testGetDiscountedPriceForBatteries() {

		PricingService service = new PricingService();

		Item battery = new Item("AAA Batteries", ItemType.POWER, 0.85);

		ShoppingCartItem shoppingItem = new ShoppingCartItem(battery, 4);

		assertEquals(2.55, service.getDiscountedPrice(shoppingItem), 0.001);

	}

}
