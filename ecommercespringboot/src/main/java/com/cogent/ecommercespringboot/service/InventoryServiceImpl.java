package com.cogent.ecommercespringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.model.Inventory;
import com.cogent.ecommercespringboot.repository.InventoryRepository;


@Service
	public class InventoryServiceImpl implements InventoryService {


		
		@Autowired
		private InventoryRepository inventoryRepository;	
		
		@Override
		public Optional<Inventory> addInventory(Inventory inventory) {
			// TODO Auto-generated method stub
			Inventory inventory2 = inventoryRepository.save(inventory);
			
			return Optional.ofNullable(inventory2);
		   	
		}

		@Override
		public void deleteInventoryById(String inventoryid) {
			// TODO Auto-generated method stub
		 inventoryRepository.deleteById(inventoryid);
		}
		

		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			inventoryRepository.deleteAll();
		}

		
		@Override
		public Optional<Inventory> getInventoryByID(String id) {
			// TODO Auto-generated method stub
			return inventoryRepository.getInventoryByID(id);
		}

		
		@Override
		public List<Inventory> getInventory() {
			// TODO Auto-generated method stub
			return null;
					
		}
			@Override
		public String updateInventory(String id) {
			// TODO Auto-generated method stub
				if(inventoryRepository.existsById(id)) {
					inventoryRepository.save(inventory);
					return "Success";
				}
				return "ID not found";
			}	
			
			
			@Override
		public boolean isInventoryExist(String inventoryid) {
			// TODO Auto-generated method stub
	              
			return inventoryRepository.existsById(inventoryid);
		}

	}		
	
	
	
	
	


