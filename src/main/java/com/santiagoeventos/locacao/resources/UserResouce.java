package com.santiagoeventos.locacao.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiagoeventos.locacao.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> FinfAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "34991340673", "12345");
		return ResponseEntity.ok().body(u);
	}
}
