package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommercespringboot.repository.CartRepository;



@Service
public class CartServiceImpl implements CartService {
	
	private static final String Id = null;
	@Autowired
	CartRepository cartRepository;

	@Override
	public String addCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart added = cartRepository.save(cart);
		if(added!=null)
			return "success";
		else	
			
		return "fail";
	}

	@Override
	public String deleteCartById(String Id) {
		// TODO Auto-generated method stub
		if(cartRepository.existsById(Id)) {
			cartRepository.deleteById(Id);
			return "Success";
		}
		return "Id not found";
	
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		cartRepository.deleteAll();
		
	}

	@Override
	public Optional<Cart> getCartById(String Id) {
		// TODO Auto-generated method stub
		Cart data = cartRepository.getById(Id);
		return Optional.ofNullable(data);
	}

	@Override
	public String updateCart(String Id, Cart cart) {
		// TODO Auto-generated method stub
		if(cartRepository.existsById(Id)) {
			cartRepository.save(cart);
			return "Success";
		}
		return "ID not found";
	}
	

	@Override
	public Optional<List<Cart>> getAllCart() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(cartRepository.findAll());
}
	
}