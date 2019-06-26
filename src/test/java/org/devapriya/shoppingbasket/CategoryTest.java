package org.devapriya.shoppingbasket;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

public class CategoryTest {

	@Test
	public void testDefaultCategoryCreation() {
		Category category = new Category();
		
		assertEquals("Category Id must be 0", 0, category.getCategoryId());
		assertEquals("Item List must be empty", 0, category.items.size());
	}

	@Test
	public void testCustomCategoryCreation() {		
		Item item1 = new Item(10, 15, new BigDecimal(15.00), new BigDecimal(3.00), 4);
		Item item2 = new Item(10, 16, new BigDecimal(8.00), new BigDecimal(2.00), 3);
		
		ArrayList<Item> itemList = new ArrayList<Item>(2);
		itemList.add(item1);
		itemList.add(item2);
		
		Category category = new Category(10, itemList);
		assertEquals("Category Id must be 10", 10, category.getCategoryId());
		assertEquals("Item List must be size of two", 2, category.items.size());
	}

	@Test
	public void testGetItems() {
		Item item1 = new Item(10, 15, new BigDecimal(15.00), new BigDecimal(3.00), 4);
		Item item2 = new Item(10, 16, new BigDecimal(8.00), new BigDecimal(2.00), 3);
		
		ArrayList<Item> itemList = new ArrayList<Item>(2);
		itemList.add(item1);
		itemList.add(item2);
		
		Category category = new Category(10, itemList);
		assertEquals("Item list must be same", itemList.hashCode(), category.getItems().hashCode());
	}

}
