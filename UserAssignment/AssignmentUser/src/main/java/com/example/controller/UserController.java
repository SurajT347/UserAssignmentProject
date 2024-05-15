package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserRepo;
import com.example.entity.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	
	@Autowired
	UserRepo repo;
	
	public List <User> getUser(){
		return repo.findAll();
	}
	@GetMapping("/getUserbyId/{}")
	public User getUserByuserId(@PathVariable Integer Id){	
		return repo.findById(Id).get();		
  }
	@GetMapping("/getUserbyuserNm/{userNm}")
	public List<User> getUserByuserNm(@PathVariable String Nm){
		return repo.findByuserNm(Nm);
	}
	
}
