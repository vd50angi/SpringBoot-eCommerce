package com.cogent.ecommercespringboot.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerce.model.Catalog;
import com.cogent.ecommerce.model.Orders;

@Repository

public interface OrdersRepository extends JpaRepository<Orders,String>{
	
	
	
	
	
	
	
	
	

}
