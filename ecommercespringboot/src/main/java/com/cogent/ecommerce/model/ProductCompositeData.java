package com.cogent.ecommerce.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductCompositeData implements Serializable {
	
	private int barcode;
	private int productcode;
	public int getBarcode() {
		return barcode;
		
		
	}
	public int getProductcode() {
		return productcode;
	}
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	@Override
	public int hashCode() {
		final int prime = 99;
		int result = 1;
		result = prime * result + barcode;
		result = prime * result + productcode;
		return result;
	}	
		@Override
		public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		ProductCompositeData other = (ProductCompositeData) obj;
		if (barcode != other.barcode)
			return false;
		if (productcode != other.productcode)
			return false;
		return true;
		
	
	}
	
	

}



































