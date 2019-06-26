/**
 * 
 */
package org.devapriya.shoppingbasket;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author dbherath
 *
 */
public class UtilitiesTest {

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.Utilities#generateRandomItemPrice()}.
	 */
	@Test
	public void testGenerateRandomItemPrice() {
		
		BigDecimal start 	= new BigDecimal("1.00");
		BigDecimal end 		= new BigDecimal("20.00");
		
		BigDecimal random	= Utilities.generateRandomItemPrice();
		
		assertTrue(random.compareTo(start) >= 0 && end.compareTo(random) >= 0);		
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.Utilities#generateRandomShippingCost()}.
	 */
	@Test
	public void testGenerateRandomShippingCost() {
		
		BigDecimal start 	= new BigDecimal("1.00");
		BigDecimal end 		= new BigDecimal("20.00");
		
		BigDecimal random	= Utilities.generateRandomShippingCost();
		
		assertTrue(random.compareTo(start) >= 0 && end.compareTo(random) >= 0);		
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.Utilities#generateRandomRating()}.
	 */
	@Test
	public void testGenerateRandomRating() {
		
		int start = 1;
		int end	= 5;
		
		int random = Utilities.generateRandomRating();
		
		assertTrue(start <= random && random <= end);	
	}

}
