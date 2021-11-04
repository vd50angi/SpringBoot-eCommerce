package com.cogent.ecommercespringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.User;
import com.cogent.ecommercespringboot.repository.UserRepository;




@Service
	public class UserServiceImpl implements UserService {


		@Autowired
	  private	UserRepository userRepository;

		@Override
		public void addUser(User user1) {
			// TODO Auto-generated method stub
			
			return userRepository.addUser(user1);
		/*	@Override
			public String deleteUserById(String Id) {
				// TODO Auto-generated method stub
				return repository.deleteUserById(Id);
			}
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				repository.deleteAll();
			}
			@Override
			public Optional<User> getUserById(String Id) {
				// TODO Auto-generated method stub
				return repository.getUserById(Id);
			}
			@Override
			public String updateUser(String Id, User user) {
				// TODO Auto-generated method stub
				return repository.updateUser(Id, user);	*/
		}
		
		
		
		}

		
	
	
	
	
	
	

