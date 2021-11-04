package com.cogent.ecommerce.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Embeddable


public class OrdersInventory {

	//put the primary key here
	
	private String  userId;
	private String   productId;
	

}
