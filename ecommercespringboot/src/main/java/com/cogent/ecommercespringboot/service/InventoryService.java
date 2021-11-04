package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.model.Inventory;

public interface InventoryService {

	Optional addInventory(Inventory inventory);

	Optional<Inventory> getInventoryByID(String id);

	void deleteInventoryById(String inventoryid);

	void deleteAll();

	boolean isInventoryExist(String Id);

	String updateInventory(String id);

	List<Inventory> getInventory();

}
