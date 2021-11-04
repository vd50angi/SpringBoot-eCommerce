package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Category;
import com.cogent.ecommercespringboot.repository.CategoryRepository;



@Service	
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository repository;

	@Override
	public Optional<Object> addCategory(Category category) {
		// TODO Auto-generated method stub
		
		Category added = repository.save(category);
		if(added!=null)
			return Optional.of("success");
		else
			return Optional.empty();	
	
	}

	@Override
	public String deleteById(String id) throws IOException {
		// TODO Auto-generated method stub
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "Success";
		}
		return "Id not found";
	}

	@Override
	public void deleteAllCategory() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}

	@Override
	public Optional<Category> getCategoryById(String id)  {
		// TODO Auto-generated method stub
		Category data =repository.getById(id);
		return Optional.ofNullable(data);
	}

	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCategory(String id, Category Category) throws IOException {
		// TODO Auto-generated method stub
		if(repository.existsById(id)) {
			repository.save(Category);
			return "Success";
		}
		return "ID not found";	
	}

	@Override
	public boolean isCategoryExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	
}



}