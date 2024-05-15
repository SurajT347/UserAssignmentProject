package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Vehicle;



public interface VahicleRepo extends JpaRepository<Vehicle, Integer>{


	List<Vehicle> findByvehicleNm(String nm);

}
