package org.devapriya.shoppingbasket;

import java.util.ArrayList;

/**
 * Main application entry point
 * @author dbherath
 */
public class App 
{
	final static int itemListSize = 10;
	final static int categoryListSize = 20;
	private ArrayList<Category> categoryList;
	private ShoppingBasket basket;
	
	
	public App() {
    	
    	categoryList = this.initializeCategories(App.categoryListSize);
        basket = new ShoppingBasket(categoryList);
        basket.fillShoppingBasket();
    }
	
	/**
	 * Initialize categories for shopping with items
	 * @param listSize
	 * @return Categories list
	 */
	public ArrayList<Category> initializeCategories(int listSize){
    	
    	ArrayList<Category> categoryList = new ArrayList<Category>(listSize);
    	
    	for (int i=0; i<listSize; i++) {
    		categoryList.add(CategoryFactory.createCategory(i+1, ItemFactory.createItemList(App.itemListSize)));
    	}
    	
    	return categoryList;
    }
	
	/**
	 * Main entry point
	 * @param args
	 */
    public static void main( String[] args )
    {    
    	App objApp = new App();
    }
    
}
