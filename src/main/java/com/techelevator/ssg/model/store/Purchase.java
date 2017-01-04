package com.techelevator.ssg.model.store;

public class Purchase {
	
	
	private Product product;
	private int quantity;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public DollarAmount getTotalOwed() {
		int totalInCents = product.getPrice().getTotalAmountInCents() * quantity;
		return new DollarAmount(totalInCents);
	}

}
 