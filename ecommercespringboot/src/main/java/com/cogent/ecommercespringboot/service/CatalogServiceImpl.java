package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Catalog;
import com.cogent.ecommercespringboot.repository.CatalogRepository;




@Service
	public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogRepository repository;// = CatalogRepositoryImpl.getInstance();

	@Override
	public String addCatalog(Catalog catalog) {
		Catalog added = repository.save(catalog);
		if(added!=null)
			return "success";
		else
			return "fail";
	
		
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
	public void deleteAllCatalog() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}

	@Override
	public Optional<Catalog> getCatalogById(String id)  {
		// TODO Auto-generated method stub
		Catalog catalog = repository.getById(id);
		return Optional.ofNullable(catalog);
	}
		
	
	@Override
	public List<Catalog> getCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCatalog(String id, Catalog Catalog)  {
		// TODO Auto-generated method stub
		if(repository.existsById(id)) {
			repository.save(Catalog);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public boolean isCatalogExist(String id) {
		// TODO Auto-generated method stub
		return catalogRepository.isCatalogExist(Id);
		
		//return false;
	}




}


