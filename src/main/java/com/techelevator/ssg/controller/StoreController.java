package com.techelevator.ssg.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;

@Controller
@SessionAttributes("shoppingCart")
public class StoreController {

	 private ProductDao productDao;
	 private ShoppingCart shoppingCart;

	 @Autowired
	 public StoreController(ProductDao productDao) {
		 this.productDao = productDao;
		 this.shoppingCart = new ShoppingCart();
	 }
	
	@RequestMapping("/productList")
	public String showProductList(ModelMap model) {
		
		List <Product> productList = productDao.getAllProducts();
		model.put("productList", productList);
		
		return "productList";
	}
	
	@RequestMapping("/productDetail")
	public String showProductDetail(@RequestParam long productId, ModelMap model) {
		model.addAttribute("product", productDao.getProductById(productId));
		
		return "productDetail";
	}
	
	@RequestMapping(path="/shoppingCart", method=RequestMethod.GET)
	public String viewShoppingCart(ModelMap model) {
		model.addAttribute("shoppingCart", shoppingCart);
		return "ShowShoppingCart";
	}
	
	@RequestMapping(path="/shoppingCart", method=RequestMethod.POST)
	public String addToShoppingCart(@RequestParam long productId, @RequestParam int quantity) {
		Product product = productDao.getProductById(productId);
		shoppingCart.addToCart(product, quantity);
		return "redirect:/shoppingCart";
	}
}
