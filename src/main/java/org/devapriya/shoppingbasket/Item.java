/**
 * 
 */
package org.devapriya.shoppingbasket;

import java.math.BigDecimal;

/**
 * This class hold item information and total cost of an item with shipping cost
 * @author dbherath
 *
 */
public class Item implements Comparable {
	
	protected int itemId;
	protected int rating;
	protected BigDecimal price;
	protected BigDecimal shippingCost;
	protected BigDecimal totalCost;
	
	
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
	 * Get item id
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	
	/**
	 * Get price of the item
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * Get shipping cost of the item
	 * @return the shippingCost
	 */
	public BigDecimal getShippingCost() {
		return shippingCost;
	}
	
	/**
	 * Get the rating
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	
	/**
	 * Calculate the total cost of item with shipping cost
	 * @return the total cost
	 */
	public BigDecimal getTotalCost() {
		return price.add(this.shippingCost);
	}

	/**
	 * this function overrides compareTo function
	 */
	@Override
    public int compareTo(Object compareItem) {
		
        int compareRating = ((Item)compareItem).getRating();
        
        return compareRating-this.rating;
    }
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + ", shippingCost=" + shippingCost + ", rating=" + rating + "]";
	}

}
