package org.devapriya.shoppingbasket;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class maintain Array of Item list for each category
 * @author dbherath
 *
 */
public class Category {

	protected int categoryId;
	protected ArrayList<Item> items = new ArrayList<Item>(10);
	

	/**
	 * @param categoryId
	 * @param items
	 */
	public Category(int categoryId, ArrayList<Item> items) {
		super();
		this.categoryId = categoryId;
		this.items = items;
	}

	
	/**
	 * Function to get category Id
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}
	

	/**
	 * Function to get list of items as an ArrayList
	 * @return Array List of Items
	 */
	public ArrayList<Item> getItems(){
		return this.items;
	}
	
	
	/**
	 * Function to get random Item object from items array list
	 * @return Item object
	 */
	public Item getRandomItem() {
		return items.get(new Random().nextInt(items.size()));
	}



	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", items=" + items + "]";
	}
	
}
