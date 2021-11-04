package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import com.cogent.ecommerce.model.Orders;

public interface OrdersService  {
	
	public Optional addOrders(Orders cart);
	public String deleteById(String id)throws  IOException;;
	public void deleteAllOrders();
	public Orders getOrdersById(String id) throws  IOException;
	public List<Orders> getOrders();
	public String updateOrders(String id, Orders Orders)throws  IOException;
	public boolean isOrdersExist(String id);
}
	
	


