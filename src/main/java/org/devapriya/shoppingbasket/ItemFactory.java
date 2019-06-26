/**
 * 
 */
package org.devapriya.shoppingbasket;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author dbherath
 *
 */
public class ItemFactory {
	
	/**
	 * This function will create list of item objects
	 * Every items will be defined with following values 
	 * item id - random item id
	 * item price - random item price between $1-$20
	 * shipping cost - random shipping cost between $1-$5
	 * rating - random rating between 1-5
	 *  
	 * @param categoryId - category id related to item list 
	 * @param listSize - will define the size of item list
	 * @return generated array list of items
	 */
	public static ArrayList<Item> createItemList(int categoryId, int listSize){
		
		ArrayList<Item> itemList = new ArrayList<Item>(listSize);
		
		for (int i=0; i<listSize; i++) {
			itemList.add(i, new Item(categoryId, (i+1), Utilities.generateRandomItemPrice(), Utilities.generateRandomShippingCost(), Utilities.generateRandomRating()) );
		}
		
		return itemList;
	}

}
