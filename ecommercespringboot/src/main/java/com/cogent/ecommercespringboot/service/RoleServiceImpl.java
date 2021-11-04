package com.cogent.ecommercespringboot.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.model.Role;
import com.cogent.ecommercespringboot.repository.RoleRepository;



@Service
	public class RoleServiceImpl implements RoleService {


		@Autowired
		private RoleRepository roleRepository;	
		
		@Override
		public String addRole(Role role) {
			Role added = roleRepository.save(role);
			if(added!=null)
				return "success";
			else
				return "fail";
		}

		@Override
		public String deleteRoleById(String id) {
			if(roleRepository.existsById(id)) {
				roleRepository.deleteById(id);
				return "Success";
			}
			return "Id not found";
		}

		@Override
		public String updateRole(String id, Role role) {
			if(roleRepository.existsById(id)) {
				roleRepository.save(role);
				return "Success";
			}
			return "ID not found";
		}

		@Override
		public void deleteAll() {
			roleRepository.deleteAll();
			
		}

		@Override
		public Optional<Role> getRoleById(String id) {
			Role data = roleRepository.getById(id);
			return Optional.ofNullable(data);
		}

		@Override
		public Optional<List<Role>> getAllRole() {
			return Optional.ofNullable(roleRepository.findAll());
		}	
	

	}		
		
