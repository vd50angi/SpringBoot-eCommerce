package com.cogent.ecommercespringboot.repository;

import java.sql.SQLException;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerce.model.Cart;

@Repository 
public interface CartRepository extends JpaRepository<Cart,String> {

	
//	public String addCart(Cart cart);
//	public String deleteCartById(String Id);
//	public void deleteAll();
//	public Optional<Cart> getCartById(String Id);
//	public String updateCart(String Id, Cart cart);



	
	
	
	
	

}
