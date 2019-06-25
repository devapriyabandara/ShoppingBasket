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
	
	private final BigDecimal totalCost = new BigDecimal(50.0);
	private ArrayList<Category> categoryList;
	private ArrayList<Item> basket;
	
	
	public ShoppingBasket() {		
	}

	
	/**
	 * @param categoryList
	 */
	public ShoppingBasket(ArrayList<Category> categoryList) {
		super();
		this.basket = new ArrayList<Item>();		
		this.categoryList = categoryList;
	}
	
	
	
	/**
	 * Method to fill shopping basket array list
	 */
	protected void fillShoppingBasket() {					
		
		for (int i=0; i<this.categoryList.size(); i++) {
			
			Category category = this.categoryList.get(i);			
			ArrayList<Item> itemList = category.getItems();
			
			// Sort all the items in the category list based on the item rating in descending order
			Collections.sort(itemList);
			
			// Get the 0th index from itemList as it has the highest rating
			Item item = itemList.get(0);	
			
			
			// If total cost of shopping basket not exceeds $50 
			if (this.getTotalCostOfShoppingBasket().compareTo(this.totalCost) == -1) {
				
				// Add new item from each category to shopping basket
				this.basket.add(item);
				
				System.out.println("Category : "+category.getCategoryId());
				System.out.println(item.toString() +", Total Cost : "+item.getTotalCost() );	
				System.out.println("Total Shopping Bucket Cost : "+this.getTotalCostOfShoppingBasket());
				System.out.println("Sum Shopping Item Rating : "+this.getSumOfRatingsOfPickedItems());
				
				System.out.println();
			}
			else {
				
				// If basket total cost exceeds $50 then remove last added item 
				this.basket.remove(i-1);
				System.out.println();
				System.out.println("Total Shopping Bucket Cost exceeds $50 ");
				System.out.println("Total Shopping Bucket Cost : "+this.getTotalCostOfShoppingBasket());
				System.out.println("Sum Shopping Item Rating : "+this.getSumOfRatingsOfPickedItems());
				
				break;
			}					
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

}
