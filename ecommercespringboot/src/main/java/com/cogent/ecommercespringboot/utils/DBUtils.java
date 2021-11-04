package com.cogent.ecommercespringboot.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {
	
	//@Lazy(value = true)
		
				
		 @Autowired //DI
			DataSource dataSource;
		     
		 public DBUtils() {
		     }
	
				// singleton pattern.
				public Connection getConnection() throws SQLException, ClassNotFoundException {
				
					
					Connection connection = null;
					connection = dataSource.getConnection();
					
				
					return null;
				}
				
				public void closeConnection(Connection connection) {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	

}
