package com.cogent.ecommercespringbooot;



import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.Entity;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.ecommerce.model.Cart;
import com.cogent.ecommerce.model.Catalog;
import com.cogent.ecommerce.model.Orders;
import com.cogent.ecommerce.model.OrdersInventory;
import com.cogent.ecommerce.model.Role;
import com.cogent.ecommerce.model.User;
import com.cogent.ecommerce.service.InventoryService;
import com.cogent.ecommercespringboot.service.CartService;
import com.cogent.ecommercespringboot.service.CatalogService;
import com.cogent.ecommercespringboot.service.CategoryService;
import com.cogent.ecommercespringboot.service.OrdersService;
import com.cogent.ecommercespringboot.service.UserService;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@SpringBootApplication
public class EcommercespringbootApplication {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = SpringApplication.run(EcommercespringbootApplication.class, args);
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		
		UserService userservice=applicationContext.getBean(UserService.class);
		 Role role1=new Role();
		 role1.setRoleId("AD101");
		 role1.setRoleName("Admin");
		 role1.setRoleName("Admin:");
		 User user1=new User();
		 user1.setUserId("a101");
		 user1.setUserName("User1");
		 user1.setRoleId("111");
		 user1.setRole(role1);
		 userservice.addUser(user1);
		 System.out.println("Data saved "); 
		
		//
		/*CatalogService catalogservice=applicationContext.getBean(CatalogService.class,args)
		//InventoryService inventoryservice=applicationContext.getBean(InventoryService.class,args)
		
		Catalog catalog = new Catalog("samsung1","SamsungTV","Amz1"," 85 inch SmartTV", "samsung.jpg"); 
		OrdersInventory inv  = new OrdersInventory(); 
		inv.setOrderId("Samsung1");
		inv.setUserId("AD1");
		
		
		OrdersService ordersService=applicationContext.getBean(OrdersService.class,args)
		Orders order = new Orders("Samsumg1","AD1","inv101","Samsung101",30,50,1500);
		ordersService.addOrders(orders)
		System.out.println("Data saved ");*/
		
		
		CartService cartService=applicationContext.getBean(CartService.class,args); 
		
		 Cart cart = new Cart();
		 cart.setCartID("adC1");
		 cart.setUserID("AD1");
		 cart.setInvID("inv101");
		 cart.setProductID("Samsung1");
		 cart.setProductQty(1);
		 cart.setProductPrice(1500);
		 cartService.addCart(cart);
		 System.out.println("Data saved ");
		
		if (Optional.isEmpty()) {
			System.out.println("Not added ");
		}else {
			System.out.println(Optional.get());
			
		}
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* List<Orders> orderList = new ArrayList<Orders>();
		orderList.add(order1);
		
		cart.setCartID("adC1");
		
		cart.setOrders(orderList);
		
		cart.setProductID("Samsung1");
		cart.setProductPrice(1500);
		cart.setTotalPrice(3000);
		CartService cs = applicationContext.getBean(CartService.class);
	
		
		cartservice.addCart(cart);*/
	
	
		System.out.println("Data saved ");
	
	
	}	
		
		
}		
		
		
		
		
		
		
		
/*		UserService userservice=applicationContext.getBean(UserService.class);
		 Role role1=new Role();
		 role1.setRoleId("AD101");
		 role1.setRoleName("Admin");
		 role1.setRoleName("Admin:");
		 User user1=new User();
		 user1.setUserId("a101");
		 user1.setUserName("User1");
		 user1.setRoleId("111");
		 user1.setRole(role1);
		 userservice.addUser(user1);
		  System.out.println("Data saved ");
		
	//**	
		
	CatalogService catalogService =  applicationContext.getBean(CatalogService.class);
	  
	Catalog catalog = new Catalog("D112", "Dell XPS", "AMZThech", "Dell XPS 15 inch 16 GB", "dell16.jpg");
 	OrdersInventory  inv = new OrdersInventory();
 	inv .setOrderId("Dell XPS");
 	inv.setUserId("AD101");
 	inv.setOrderId("cart01", "AD1","inv122","DellXPS 15",14,744,"1999");
	Orders order = new Orders(inv, "Inv111","AD12","Dell XPS", 60966, "45656.369");
	
	OrdersService orderservice=applicationContext.getBean(OrdersService.class,args);
	orderservice.addOrder(order);
	System.out.println("order saved");
	Optional<Catalog> optional = catalogService.addInventory(catalog);
	 if(Optional.isEmpty())  {
			
		  System.out.println("Inventory is not added succesfully");
	
	 } else {
	 		System.out.println(optional.get());*/
/*		
	}
	
}

}	 
	*/
	//******************************************************************
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	