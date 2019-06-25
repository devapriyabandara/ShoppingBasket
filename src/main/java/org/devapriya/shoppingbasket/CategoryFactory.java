package org.devapriya.shoppingbasket;

import java.util.ArrayList;

/**
 * @author dbherath
 *
 */
public class CategoryFactory {
	
	/**
	 * Function to create category by passing category id and list of items
	 * @param categoryId
	 * @param items
	 * @return generated Category object
	 */
	public static Category createCategory(int categoryId, ArrayList<Item> items) {
		
		return new Category(categoryId, items);
	}

}
