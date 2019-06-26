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
public class Item implements Comparable<Item> {
	
	protected int categoryId = 0;
	protected int itemId = 0;
	protected int rating = 0;
	protected BigDecimal price = new BigDecimal(0.00);
	protected BigDecimal shippingCost = new BigDecimal(0.00);
	protected BigDecimal totalCost = new BigDecimal(0.00);
	
	
	/**
	 * Default constructor
	 */
	public Item() {		
	}
	
	
	/**
	 * @param categoryId
	 * @param itemId
	 * @param price
	 * @param shippingCost
	 * @param rating
	 */
	public Item(int categoryId, int itemId, BigDecimal price, BigDecimal shippingCost, int rating) {
		super();
		this.categoryId = categoryId;
		this.itemId = itemId;
		this.price = price;
		this.shippingCost = shippingCost;
		this.rating = rating;
	}
	
	
	/**
	 * Get category id
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
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
    public int compareTo(Item compareItem) {
		
        int compareRating = ((Item)compareItem).getRating();
        
        return compareRating-this.rating;
    }
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
		result = prime * result + itemId;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + rating;
		result = prime * result + ((shippingCost == null) ? 0 : shippingCost.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
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
		Item other = (Item) obj;
		if (categoryId != other.categoryId)
			return false;
		if (itemId != other.itemId)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (rating != other.rating)
			return false;
		if (shippingCost == null) {
			if (other.shippingCost != null)
				return false;
		} else if (!shippingCost.equals(other.shippingCost))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Item [categoryId=" +categoryId+ ", itemId=" + itemId + ", price=" + price + ", shippingCost=" + shippingCost + ", rating=" + rating + "]";
	}

}
