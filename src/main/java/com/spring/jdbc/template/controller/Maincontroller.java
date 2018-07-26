package com.spring.jdbc.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbc.template.dao.UserRepository;
import com.spring.jdbc.template.model.User;

@RestController
@RequestMapping("/api")
public class Maincontroller {
	
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody User user){
		
		
		User newUsers=new User();
		newUsers.setEmail(user.getEmail());
		//newUsers.setId(user.getId());
		newUsers.setName(user.getName());
		User users=userRepo.create(newUsers);
		
		return new ResponseEntity(users, HttpStatus.CREATED);
		
	}
	
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void getUsers(){
		
		userRepo.getUsers();
	
	}
	
	
}
