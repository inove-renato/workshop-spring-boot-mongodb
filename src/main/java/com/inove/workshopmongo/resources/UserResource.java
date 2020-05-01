package com.inove.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inove.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User u1 = new User("1","Teste","teste@testes.com");
		User u2 = new User("2","Tio Patinhas","patinhas@testes.com");
		
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(u1, u2));
		
		return ResponseEntity.ok().body(lista);
	}
	
}
