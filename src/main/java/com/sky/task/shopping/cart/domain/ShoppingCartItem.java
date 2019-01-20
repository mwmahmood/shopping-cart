package com.sky.task.shopping.cart.domain;

import java.util.Optional;

public class ShoppingCartItem {
	
	private Item item;
	private Integer quantity;
	private Double discountedPrice;
	private Optional<Promotion> promotion;
	
	public ShoppingCartItem(Item item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	public Item getItem() {
		return item;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(Double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public Optional<Promotion> getPromotion() {
		return promotion;
	}
	public void setPromotion(Optional<Promotion> promotion) {
		this.promotion = promotion;
	}

}
