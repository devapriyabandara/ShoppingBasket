package org.devapriya.shoppingbasket;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Utilities class to generate random values to define item objects
 * @author dbherath
 *
 */
public class Utilities {
	
	/**
	 * Generate random item price based on the defined start and end price range
	 * @return item price
	 */
	public static BigDecimal generateRandomItemPrice() {
		
		BigDecimal start 	= new BigDecimal("1.00");
		BigDecimal end 		= new BigDecimal("20.00");
		BigDecimal range 	= end.subtract(start);
		
		BigDecimal price 	= start.add(range.multiply(new BigDecimal(Math.random()))).setScale(2, BigDecimal.ROUND_HALF_DOWN);
		
		return price;		
	}
	
	
	/**
	 * Generate random shipping cost within defined shipping cost range
	 * @return shipping cost
	 */
	public static BigDecimal generateRandomShippingCost() {
		
		BigDecimal start 	= new BigDecimal("2.00");
		BigDecimal end 		= new BigDecimal("5.00");
		BigDecimal range 	= end.subtract(start);
		
		BigDecimal price 	= start.add(range.multiply(new BigDecimal(Math.random()))).setScale(2, BigDecimal.ROUND_HALF_DOWN);
		
		return price;		
	}
	
	
	/**
	 * Generate random rating value within defined range
	 * @return rating
	 */
	public static int generateRandomRating() {
		
		int start 	= 1;
		int end		= 5;
				
		return start + new Random().nextInt((end-start)+1);		
	}

}
