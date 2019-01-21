package com.sky.task.shopping.cart;

import java.util.List;

import com.sky.task.shopping.cart.domain.ShoppingCartItem;
import com.sky.task.shopping.cart.service.PricingService;

public class ShoppingCart {

	public static void main(String[] args) {
		
		PricingService pricingService = new PricingService();
		
		List<ShoppingCartItem> shoppingCartItems = pricingService.buildShoppingCartItems();
		
		System.out.println("Shopping Cart");
		System.out.println("-------------");
		shoppingCartItems.stream()
		.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Total Discounted Price:" +
				shoppingCartItems.stream()
									  .mapToDouble(ShoppingCartItem::getDiscountedPrice)
									  .sum());
  
	}

}
