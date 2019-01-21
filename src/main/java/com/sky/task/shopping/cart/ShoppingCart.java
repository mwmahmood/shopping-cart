package com.sky.task.shopping.cart;

import java.text.DecimalFormat;
import java.util.List;

import com.sky.task.shopping.cart.domain.ShoppingCartItem;
import com.sky.task.shopping.cart.service.PricingService;

public class ShoppingCart {

   public static void main(String[] args) {

      PricingService pricingService = new PricingService();

      List<ShoppingCartItem> shoppingCartItems = pricingService.buildShoppingCartItems();
      
      DecimalFormat decimalFormat = new DecimalFormat("#0.00");

      System.out.println("Shopping Cart");
      System.out.println("-------------");
      shoppingCartItems.stream()
                       .forEach(System.out::println);

      System.out.println();
      
      System.out.println("Total Price:"
            + decimalFormat.format(shoppingCartItems.stream()
                                                    .mapToDouble(ShoppingCartItem::getPrice)
                                                    .sum()));
      System.out.println("Discounted Price:"
            + decimalFormat.format(shoppingCartItems.stream()
                                                    .mapToDouble(ShoppingCartItem::getDiscountedPrice)
                                                    .sum()));

   }

}
