package com.sky.task.shopping.cart.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.sky.task.shopping.cart.domain.Item;
import com.sky.task.shopping.cart.domain.ShoppingCartItem;
import com.sky.task.shopping.cart.domain.enums.ItemType;

public class ShoppingCartItemsLoaderTest {

   @Test
   public void testLoadItems() {
      ShoppingCartItemsLoader itemsLoader = new ShoppingCartItemsLoader();

      Map<String, Item> itemMap = itemsLoader.loadAllItems();

      assertNotNull(itemMap);

      assertEquals(4, itemMap.size());

      assertEquals("Headphones", itemMap.get("Headphones").getName());
      assertEquals("Speakers", itemMap.get("Speakers").getName());
      assertEquals("AAA Batteries", itemMap.get("AAA Batteries").getName());
      assertEquals("Protein Bars", itemMap.get("Protein Bars").getName());

      assertEquals(ItemType.AUDIO, itemMap.get("Headphones").getItemType());
      assertEquals(ItemType.AUDIO, itemMap.get("Speakers").getItemType());
      assertEquals(ItemType.POWER, itemMap.get("AAA Batteries").getItemType());
      assertEquals(ItemType.FOOD, itemMap.get("Protein Bars").getItemType());

      assertEquals(150.0, itemMap.get("Headphones").getPrice(), 0.001);
      assertEquals(85.0, itemMap.get("Speakers").getPrice(), 0.001);
      assertEquals(0.85, itemMap.get("AAA Batteries").getPrice(), 0.001);
      assertEquals(25.0, itemMap.get("Protein Bars").getPrice(), 0.001);
   }

   @Test
   public void testLoadShoppingItems() {
      ShoppingCartItemsLoader shoppingCartLoader = new ShoppingCartItemsLoader();

      List<ShoppingCartItem> shoppingItems = shoppingCartLoader.loadAllShoppingItems();

      assertNotNull(shoppingItems);

      assertEquals(3, shoppingItems.size());

   }

}
