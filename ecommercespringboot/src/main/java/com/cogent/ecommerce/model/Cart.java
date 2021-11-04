package com.cogent.ecommerce.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//OneToMany Relationship SpringBoot

@Data//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cart")
public class Cart {
	@Id
	private String cartID;
	private String userID;
	private String invID;
	private String productID;;
	private int productQty;
	private double productPrice;
	private double totalPrice;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orders>orders;
	
}



/*SpringBoot
 * 
 * public class Cart {
 @Id
 @GeneratedValue
	
	private String productId;
	private String productName;
	private String catId;
	private String productDescription;
	private String productImage;
	 
*/		
	
	
	
	
	
	
	

	