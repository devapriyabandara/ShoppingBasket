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
			
			// Get the 0th index from itemList as it has the highest rating
			Item item = itemList.get(0);	
			
			
			// If total cost of shopping basket not exceeds $50 
			if (this.basket.getTotalCostOfShoppingBasket().add(item.getTotalCost()).compareTo(this.totalCost) == -1) {
				
				// Add new item from each category to shopping basket
				this.basket.addItem(item);
				
				System.out.println("Category"+category.getCategoryId() + ":Item:"+item.toString());
				System.out.println(item.toString() +", Total Cost : "+item.getTotalCost() );	
				System.out.println("Total Shopping Bucket Cost : "+this.basket.getTotalCostOfShoppingBasket());
				System.out.println("Sum Shopping Item Rating : "+this.basket.getSumOfRatingsOfPickedItems());
				System.out.println();
			}
			else {
				
				// If basket total cost exceeds $50 then remove last added item 
				//this.basket.removeItem(this.basket.getItem(i-1));
				
				System.out.println();
				System.out.println("Total Shopping Bucket Cost exceeds $50 ");
				System.out.println("Total Shopping Bucket Cost : "+this.basket.getTotalCostOfShoppingBasket());
				System.out.println("Sum Shopping Item Rating : "+this.basket.getSumOfRatingsOfPickedItems());
				
			}	
		}
		
		
		System.out.println("---------");
		for (Item item:this.basket.getItemList()) {
			System.out.println(item.toString());
		}
		
		System.out.println("Total Shopping Bucket Cost : "+this.basket.getTotalCostOfShoppingBasket());
		System.out.println("Sum Shopping Item Rating : "+this.basket.getSumOfRatingsOfPickedItems());
		
	}
	
	

}
