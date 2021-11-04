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
@Table(name="supplier")

public class Supplier {
@Id	
	private String supplierId;
	private String supplierName;
	private String productId;
	private String productName;
	private String orderId;
	private String invId;
	private Double grandTotalPrice;
	
}	