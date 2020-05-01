package com.inove.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.inove.workshopmongo.domain.User;
import com.inove.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User u1 = new User(null, "Tio Patinhas", "patinhas@testes.com");
		User u2 = new User(null, "Pato Donald", "donald@testes.com");
		User u3 = new User(null, "Duck Tales", "duck@testes.com");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
