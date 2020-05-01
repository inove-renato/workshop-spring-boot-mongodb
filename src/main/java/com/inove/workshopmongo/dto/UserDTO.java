package com.inove.workshopmongo.dto;

import com.inove.workshopmongo.domain.User;

public class UserDTO extends User {
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(User obj) {
		this.setId(obj.getId());
		this.setName(obj.getName());
		this.setEmail(obj.getEmail());
	}
}
