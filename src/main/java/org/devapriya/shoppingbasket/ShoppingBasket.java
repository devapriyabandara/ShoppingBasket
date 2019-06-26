/**
 * 
 */
package org.devapriya.shoppingbasket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class define all the methods related to filling shopping basket
 * @author dbherath
 *
 */
public class ShoppingBasket {
	

	private ArrayList<Item> basket;
	
	
	/**
	 * @param categoryList
	 */
	public ShoppingBasket() {
		super();
		this.basket = new ArrayList<Item>();
	}
	
	
	/**
	 * This function will return all the items 
	 * @return
	 */
	protected ArrayList<Item> getItemList(){
		return this.basket;
	}
	
	/**
	 * This function will return existing item from the shopping basket
	 * @param itemId
	 * @return
	 */
	protected Item getItem(int itemId) {
		return this.basket.get(itemId);
	}
	
	
	/**
	 * This function will be adding new items to shopping basket
	 * @param item
	 */
	protected void addItem(Item item) {
		
		this.basket.add(item);
		
	}
	
	/**
	 * This function will remove an existing item from the shopping basket9
	 * @param item
	 */
	protected void removeItem(Item item) {
		
		if (this.basket.contains(item)) {
			this.basket.remove(item);
		}
		
	}
		
	
	/**
	 * Method to get total cost of picked items in the shopping basket
	 * @return total cost of the items 
	 */
	public BigDecimal getTotalCostOfShoppingBasket() {
		
		BigDecimal totalCostOfBasket = new BigDecimal(0.00);
		
		for (Item item:this.basket) {
			totalCostOfBasket = totalCostOfBasket.add(item.getTotalCost());
		}
		
		return totalCostOfBasket;
	}
	
	
	/**
	 * Method to get the sum of ratings in the shopping basket
	 * @return sum of ratings of the items in basket
	 */
	public int getSumOfRatingsOfPickedItems() {
		
		int sumOfRatings = 0;
		
		for (Item item:this.basket) {
			sumOfRatings += item.getRating();
		}
		
		return sumOfRatings;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		for (Item item:this.basket) {			
			result.append(item.toString()).append("\n");
		}
		
		return result.toString();
	}
	
	
	

}
