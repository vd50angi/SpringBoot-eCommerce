package com.cogent.ecommerce.model;

import javax.persistence.EmbeddedId;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import com.cogent.ecommerce.model.Cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OrdersData")

public class Orders {
@Id
    private OrdersInventory ordersInventory;
    private OrdersCatalog   ordersCatalog;
	private String ordersId;
	private String userId;
	private String invId;
	private String productId;
	private Integer productQty;
	private Double totalPrice;
	private Double grandTotalPrice;
	
	@ManyToOne
	private Cart cart;
	
	}