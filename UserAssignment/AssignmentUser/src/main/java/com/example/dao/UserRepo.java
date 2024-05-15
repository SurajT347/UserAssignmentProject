package com.example.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	List<User> findByuserNm(String nm);

	

	

	
}
