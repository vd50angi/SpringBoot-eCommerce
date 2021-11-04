package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.model.Category;



public interface CategoryService {
	
	public Optional addCategory(Category category);
	public String deleteById(String id)throws  IOException;;
	public void deleteAllCategory();
	public Optional<Category> getCategoryById(String id) throws  IOException;
	public List<Category> getCategory();
	public String updateCategory(String id, Category Category)throws  IOException;
	public boolean isCategoryExist(String id);
}
	
	
	
	
	
	

