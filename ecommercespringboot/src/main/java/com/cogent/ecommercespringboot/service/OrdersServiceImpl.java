package com.cogent.ecommercespringboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Orders;
import com.cogent.ecommercespringboot.repository.OrdersRepository;


@Service
	public class OrdersServiceImpl implements OrdersService {
	
		@Autowired
		private OrdersRepository ordersRepository;

		@Override
		public String addOrders(Orders cart) {
			// TODO Auto-generated method stub
			Orders added = ordersRepository.save(orders);
			if(added!=null)
				return "success";
			else
				return "fail";	
			
		}

		@Override
		public String deleteById(String id) throws IOException {
			// TODO Auto-generated method stub
			if(ordersRepository.existsById(id)) {
				ordersRepository.deleteById(id);
				return "Success";
			}
			return "Id not found";
		}

		@Override
		public void deleteAllOrders() {
			// TODO Auto-generated method stub
			ordersRepository.deleteAll();
		}

		@Override
		public Optional<Orders> getOrdersById(String id)  {
			// TODO Auto-generated method stub
			Orders data = OrdersRepository.getById(Id);
			return Optional.ofNullable(data);
		}

		@Override
		public List<Orders> getOrders() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String updateOrders(String id, Orders Orders) throws IOException {
			// TODO Auto-generated method stub
			if(ordersRepository.existsById(id)) {
				ordersRepository.save(orders);
				return "Success";
			}
			return "ID not found";
		}

		@Override
		public boolean isOrdersExist(String id) {
			// TODO Auto-generated method stub
			return orderRepository.isOrderExist(id);
		}	
	
		}

		
	


