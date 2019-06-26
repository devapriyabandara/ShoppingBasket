/**
 * 
 */
package org.devapriya.shoppingbasket;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author dbherath
 *
 */
public class ItemTest extends TestCase {

	/**
	 * @param name
	 */
	public ItemTest(String name) {
		super(name);
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.Item#Item()}.
	 */
	@Test
	public void testDefaultItemCreation() {
		Item item = new Item();
		assertEquals("Category Id must be 0", 0, item.getCategoryId());
		assertEquals("Item Id must be 0", 0, item.getItemId());
		assertEquals("Rating must be 0", 0, item.getRating());
		assertEquals("Item Price must be 0", BigDecimal.ZERO, item.getPrice());
		assertEquals("Shipping Cost must be 0", BigDecimal.ZERO,item.getShippingCost());
		assertEquals("Total Cost must be 0", BigDecimal.ZERO, item.getTotalCost());		
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.Item#Item(int, int, java.math.BigDecimal, java.math.BigDecimal, int)}.
	 */
	public void testCustomItemCreation() {
		Item item = new Item(10, 15, new BigDecimal(15.00), new BigDecimal(3.00), 4);
		assertEquals("Category Id must be 10", 10, item.getCategoryId());
		assertEquals("Item Id must be 15", 15, item.getItemId());
		assertEquals("Rating must be 4", 4, item.getRating());
		assertEquals("Item Price must be $15", new BigDecimal(15.00), item.getPrice());
		assertEquals("Shipping Cost must be $3", new BigDecimal(3.00),item.getShippingCost());
		assertEquals("Total Cost must be $18", new BigDecimal(18.00), item.getTotalCost());		
	}

	/**
	 * Test method for {@link org.devapriya.shoppingbasket.Item#getTotalCost()}.
	 */
	public void testGetTotalCost() {
		Item item = new Item(10, 15, new BigDecimal(5.00), new BigDecimal(1.00), 4);
		assertEquals("Total Cost must be $6", new BigDecimal(6.00), item.getTotalCost());	
		
	}

}
