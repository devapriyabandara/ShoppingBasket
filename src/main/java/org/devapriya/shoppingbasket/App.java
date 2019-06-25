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
	private ShoppingBasketService basketService;
	
	
	public App() {
    	basketService = new ShoppingBasketService();
        basketService.fillShoppingBasket();
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
