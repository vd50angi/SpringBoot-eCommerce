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
@Table(name="catalog")
public class Catalog {
	@Id
	private String productID;
	private String productName;
	private String catID;
	private String productDescription;
	private String productImage;
}




/*SpringBooot
 * 
 * 
 * 
 * 
 * public class Catalog {
@Id	

	private String productId;
	private String productName;
	private String catId;
	private String productDescription;
	private String productImage;
	
		// TODO Auto-generated method stub
		*/
		
	}	