package com.cogent.ecommercespringboot.service;

import java.io.IOException;


import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.model.Cart;

public interface CartService {
	public String addCart(Cart cart);
	public String deleteCartById(String Id);
	public void deleteAll();
	public Optional<Cart> getCartById(String Id);
	public String updateCart(String Id, Cart cart);
	public Optional<List<Cart>> getAllCart();
}
	
	
	


