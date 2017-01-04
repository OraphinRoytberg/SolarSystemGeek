package com.techelevator.ssg.model.store;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Purchase> purchaseList;

	public ShoppingCart() {
		purchaseList = new ArrayList<>();
	}
	
	public void addToCart(Product product, int quantity) {
		if (containsProduct(product)) {
			Purchase purchase = getPurchaseByProduct(product);
			int existingQuantity = purchase.getQuantity();
			purchase.setQuantity(existingQuantity+quantity);
			
			if (purchase.getQuantity()==0) {
				purchaseList.remove(purchase);
			}
			
		} else {
			Purchase purchase = new Purchase();
			purchase.setProduct(product);
			purchase.setQuantity(quantity);
			purchaseList.add(purchase);
		}
	}
	
	public DollarAmount getTotalOwed() {
		DollarAmount total = new DollarAmount(0);
		
		for (Purchase purchase : purchaseList) {
			total = total.plus(purchase.getTotalOwed());
		}
		return total;
	}
	
	public List<Purchase> getPurchases() {
		return purchaseList;
	}
	
	public boolean isCartEmpty() {
		return purchaseList.isEmpty();
	}
	
	private boolean containsProduct(Product product) {
		boolean contains = false;
		for (Purchase purchase : purchaseList) {
			if (purchase.getProduct().getName().equals(product.getName())) {
				contains=true;
			}
		}
		return contains;
	}
	
	private Purchase getPurchaseByProduct(Product product) {
		Purchase returnPurchase = null;
		for (Purchase purchase : purchaseList) {
			if (purchase.getProduct().getName().equals(product.getName())) {
				returnPurchase=purchase;
			}
		}
		return returnPurchase;
	}
	
}
