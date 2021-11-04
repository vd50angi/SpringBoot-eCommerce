package com.cogent.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
@Embeddable

public class UsersCompositeKey implements Serializable {
	private String userId;
	private String emailId;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId.hashCode();
		result = prime * result + emailId.hashCode();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersCompositeKey other = (UsersCompositeKey) obj;
		if (!userId.equals(other.getUserId()))
			return false;
		if (!emailId.equals(other.getEmailId()))
			return false;
		return true;
	}
}
	
	
	


