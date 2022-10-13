package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maadhar")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired 
	private UserService service;
	
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return service.register(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		return service.login(user);
	
	}

}
