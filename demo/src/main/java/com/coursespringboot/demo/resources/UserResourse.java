package com.coursespringboot.demo.resources;

import com.coursespringboot.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> finfAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "7070-7070","12345");
		return ResponseEntity.ok().body(u);
	}

}
 