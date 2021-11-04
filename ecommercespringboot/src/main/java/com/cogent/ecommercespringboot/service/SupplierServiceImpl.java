package com.cogent.ecommercespringboot.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommercespringboot.repository.SupplierRepository;




@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierrepository;
	
	@Override
	public String addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		Supplier added = supplierRepository.save(supplier);
		if(added!=null)
			return "success";
		else	
			
		return "fail";
	}

	@Override
	public String deleteSupplierById(String Id) {
		// TODO Auto-generated method stub
		if(supplierRepository.existsById(Id)) {
			supplierRepository.deleteById(Id);
			return "Success";
		}
		return "Id not found";
	
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		supplierRepository.deleteAll();
		
	}

	@Override
	public Optional<Supplier> getSupplierById(String Id) {
		// TODO Auto-generated method stub
		Supplier data = supplierRepository.getById(Id);
		return Optional.ofNullable(data);
	}

	@Override
	public String updateSupplier(String Id, Cart cart) {
		// TODO Auto-generated method stub
		if(supplierRepository.existsById(Id)) {
			supplierRepository.save(supplier);
			return "Success";
		}
		return "ID not found";
	}
	

	@Override
	public Optional<List<Supplier>> getAllSupplier() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(supplierRepository.findAll());
}
	
}
	
	
	
	
	
	
	
	
	
	

}
