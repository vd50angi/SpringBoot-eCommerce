package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.model.Catalog;

public interface CatalogService {
	public String addCatalog(Catalog catalog);
	public String deleteById(String id)throws  IOException;;
	public void deleteAllCatalog();
	public Optional<Catalog> getCatalogById(String id) throws  IOException;
	public List<Catalog> getCatalog();
	public String updateCatalog(String id, Catalog Catalog)throws  IOException;
	public boolean isCatalogExist(String id);
}
	
	
	
	
	
	








