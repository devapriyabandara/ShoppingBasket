/**
 * 
 */
package org.devapriya.shoppingbasket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is responsible of shopping basket filling
 * @author dbherath
 *
 */
public class ShoppingBasketService {
	
	private ShoppingBasket basket;
	private ArrayList<Category> categoryList;
	private final BigDecimal totalCost = new BigDecimal(50.0);

	/**
	 * @param basket
	 */
	public ShoppingBasketService() {
		super();
		this.basket = new ShoppingBasket();
		this.categoryList = this.initializeCategories(App.categoryListSize);
	}
	
	
	/**
	 * Initialize categories for shopping with items
	 * @param listSize
	 * @return Categories list
	 */
	public ArrayList<Category> initializeCategories(int listSize){
    	
    	ArrayList<Category> categoryList = new ArrayList<Category>(listSize);
    	
    	for (int i=0; i<listSize; i++) {
    		categoryList.add(CategoryFactory.createCategory(i+1, ItemFactory.createItemList(i+1, App.itemListSize)));
    	}
    	
    	return categoryList;
    }
	
	
	/**
	 * Method to fill shopping basket array list
	 */
	protected void fillShoppingBasket() {					
		
		// Iterate through each category in the category list
		for (int i=0; i<this.categoryList.size(); i++) {
			
			Category category = this.categoryList.get(i);			
			ArrayList<Item> itemList = category.getItems();
			
			// Sort all the items in the category list based on the item rating in descending order
			Collections.sort(itemList);
			
			// Loop through all the items itemList from highest rating to lowest rating
			for (int x=0; x<itemList.size(); x++) {
				
				Item item = itemList.get(x);					
				
				// If total cost of shopping basket and new item total cost not exceeds $50 
				if (this.basket.getTotalCostOfShoppingBasket().add(item.getTotalCost()).compareTo(this.totalCost) == -1) {
					
					// Add new item from each category to shopping basket
					this.basket.addItem(item);
					break;
					
					/*
					System.out.println("Category"+category.getCategoryId() + ":Item:"+item.toString());
					System.out.println(item.toString() +", Total Cost : "+item.getTotalCost() );	
					System.out.println("Total Shopping Bucket Cost : "+this.basket.getTotalCostOfShoppingBasket());
					System.out.println("Sum Shopping Item Rating : "+this.basket.getSumOfRatingsOfPickedItems());
					System.out.println();
					*/
				}
			}			
		}
		
	}
	
	
	public void printShoppingBasket() {
		System.out.println(this.basket.toString());
		System.out.println("Total Shopping Bucket Cost : "+this.basket.getTotalCostOfShoppingBasket());
		System.out.println("Sum Shopping Item Rating : "+this.basket.getSumOfRatingsOfPickedItems());
	}
	
	

}
