/**
 * 
 */
package org.devapriya.shoppingbasket;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author devapriya
 *
 */
public class ShoppingBasketTest {

	ShoppingBasket basket;
	ArrayList<Item> itemList;
	
	@Before
    public void runBeforeTestMethod() {
		basket = new ShoppingBasket();
		
		Item item1 = new Item(10, 15, new BigDecimal(15.00), new BigDecimal(3.00), 4);
		Item item2 = new Item(10, 16, new BigDecimal(8.00), new BigDecimal(2.00), 3);
		
		itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		
		basket.addItem(item1);
		basket.addItem(item2);
    }
	
	
	
	/**
	 * Test method for {@link org.devapriya.shoppingbasket.ShoppingBasket#ShoppingBasket()}.
	 */
	@Test
	public void testShoppingBasketCreation() {
		
		ShoppingBasket basket = new ShoppingBasket();
		assertEquals(0, basket.getItemList().size());
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.ShoppingBasket#getItemList()}.
	 */
	@Test
	public void testGetItemList() {
		ArrayList<Item> itemList = basket.getItemList();
		
		assertEquals(this.itemList, itemList);
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.ShoppingBasket#getItem(int)}.
	 */
	@Test
	public void testGetItem() {
		Item item = new Item(10, 15, new BigDecimal(15.00), new BigDecimal(3.00), 4);
		Item itemCheck = this.basket.getItem(item.getItemId());
		
		assertEquals(itemCheck.hashCode(), item.hashCode());
	}
	
	
	@Test
	public void testGetItemWithIncorrectItem() {
		Item item = new Item(10, 14, new BigDecimal(15.00), new BigDecimal(3.00), 4);
		Item itemCheck = this.basket.getItem(item.getItemId());
		
		assertTrue(itemCheck == null);
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.ShoppingBasket#addItem(org.devapriya.shoppingbasket.Item)}.
	 */
	@Test
	public void testAddItem() {
		
		Item item = new Item(11, 8, new BigDecimal(8.50), new BigDecimal(1.00), 5);
		this.basket.addItem(item);
				
		assertEquals(this.basket.getItem(item.getItemId()), item);
	}
	
	/**
	 * Test method for {@link org.devapriya.shoppingbasket.ShoppingBasket#getTotalCostOfShoppingBasket()}.
	 */
	@Test
	public void testGetTotalCostOfShoppingBasket() {
		BigDecimal totalCost = new BigDecimal(28.00);		
		assertEquals(totalCost, this.basket.getTotalCostOfShoppingBasket());
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.ShoppingBasket#getSumOfRatingsOfPickedItems()}.
	 */
	@Test
	public void testGetSumOfRatingsOfPickedItems() {
		int sumOfRatings = 7;
		assertEquals(sumOfRatings, this.basket.getSumOfRatingsOfPickedItems());
	}

}
