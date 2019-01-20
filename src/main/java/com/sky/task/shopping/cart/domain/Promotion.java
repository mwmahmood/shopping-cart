package com.sky.task.shopping.cart.domain;

import java.util.Optional;

import com.sky.task.shopping.cart.domain.enums.PromotionType;

public class Promotion {
	
	private String name;
	private Item itemUnderOffer;
	private PromotionType promotionType;
	private Optional<Double> discount;
	private Optional<Integer> freeItem;
	
	public Promotion(String name, Item itemUnderOffer, PromotionType promotionType) {
		super();
		this.name = name;
		this.itemUnderOffer = itemUnderOffer;
		this.promotionType = promotionType;
	}

	public Optional<Double> getDiscount() {
		return discount;
	}

	public void setDiscount(Optional<Double> discount) {
		this.discount = discount;
	}

	public Optional<Integer> getFreeItem() {
		return freeItem;
	}

	public void setFreeItem(Optional<Integer> freeItem) {
		this.freeItem = freeItem;
	}

	public String getName() {
		return name;
	}

	public Item getItemUnderOffer() {
		return itemUnderOffer;
	}

	public PromotionType getPromotionType() {
		return promotionType;
	}
	
}
