/**
 * 
 */
package org.devapriya.shoppingbasket;

import java.math.BigDecimal;

/**
 * @author dbherath
 *
 */
public class Item {
	
	protected int itemId;
	protected BigDecimal price;
	protected BigDecimal shippingCost;
	protected int rating;
	
	
	/**
	 * @param itemId
	 * @param price
	 * @param shippingCost
	 * @param rating
	 */
	public Item(int itemId, BigDecimal price, BigDecimal shippingCost, int rating) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.shippingCost = shippingCost;
		this.rating = rating;
	}
	
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * @return the shippingCost
	 */
	public BigDecimal getShippingCost() {
		return shippingCost;
	}
	
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + ", shippingCost=" + shippingCost + ", rating=" + rating + "]";
	}
	
	

}
