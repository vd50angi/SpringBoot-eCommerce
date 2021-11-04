package com.cogent.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

///import com.cogent.ecommerce.exception.InvalidPriceException;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="role")
public class Role {
@Id	

	private String roleId;
	private String roleName;
	
	@OneToOne(mappedBy="role")
	private User user;


}