package com.cogent.ecommercespringboot.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerce.model.Supplier;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier,String>{
	
	

}
