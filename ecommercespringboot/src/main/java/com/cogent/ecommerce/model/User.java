package com.cogent.ecommerce.model;

import java.beans.Statement;
import java.sql.Connection;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
	@Id
		String userId ;
	String userName ;
	String password ;
	String emailId;
	String roleId;
	
	@OneToOne(targetEntity=Role.class,cascade=CascadeType.ALL)
    @JoinColumn(name="fk_role_id",referencedColumnName="roleId")
	
   private Role role;


}
	
	
	
	


