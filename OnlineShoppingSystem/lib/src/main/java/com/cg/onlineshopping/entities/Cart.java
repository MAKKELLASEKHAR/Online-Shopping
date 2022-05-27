package com.cg.onlineshopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "cart_id")
	    private int cart_id;
	    
	    @Column(name = "total")
	    private double total;

	    @Column(name = "item_count")
	    private int itemCount;

	    @Column(name = "buying_price")
	    private double buyingPrice;

	    @Column(name = "is_available")
	    private boolean isAvailable;
	    
	    @OneToOne
	    private Item item;

		public int getCart_id() {
			return cart_id;
		}

		public void setCart_id(int cart_id) {
			this.cart_id = cart_id;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public int getItemCount() {
			return itemCount;
		}

		public void setItemCount(int itemCount) {
			this.itemCount = itemCount;
		}

		public double getBuyingPrice() {
			return buyingPrice;
		}

		public void setBuyingPrice(double buyingPrice) {
			this.buyingPrice = buyingPrice;
		}

		public boolean isAvailable() {
			return isAvailable;
		}

		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}
	    
	    
	    

}
