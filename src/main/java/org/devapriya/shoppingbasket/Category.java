package org.devapriya.shoppingbasket;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class maintain Array of Item list for each category
 * @author dbherath
 *
 */
public class Category {

	protected int categoryId = 0;
	protected ArrayList<Item> items = new ArrayList<Item>(10);
	
	
	/**
	 * Default Category
	 */
	public Category() {
	}
	

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryId != other.categoryId)
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", items=" + items + "]";
	}
	
}
