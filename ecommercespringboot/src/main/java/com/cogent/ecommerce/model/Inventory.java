package com.cogent.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="inventory")

public class Inventory {
@Id	
	private String invId;
	private String userId;
	private String productId;
	private Integer productQty;
	private Double productPrice;

		// TODO Auto-generated method stub
		
	}	
		
		