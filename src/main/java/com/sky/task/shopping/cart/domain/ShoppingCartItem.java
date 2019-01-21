package com.sky.task.shopping.cart.domain;

public class ShoppingCartItem {

	private Item item;
	private Integer quantity;
	private Double discountedPrice;

	public ShoppingCartItem(Item item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public ShoppingCartItem(Item item, Integer quantity, Double discountedPrice) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.discountedPrice = discountedPrice;
	}

	public Item getItem() {
		return item;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public Double getPrice() {
		return quantity * item.getPrice();
	}

	public Double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(Double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	@Override
	public String toString() {
		return "ShoppingCartItem [item=" + item.getName() + ", quantity=" + quantity 
		      + ", Price=" + getPrice() + ", discountedPrice=" + discountedPrice +"]";
	} 
	
}
