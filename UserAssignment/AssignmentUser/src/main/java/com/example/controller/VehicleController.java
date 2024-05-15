package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.VahicleRepo;
import com.example.entity.Vehicle;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleController {

	 @Autowired
	  VahicleRepo repo;
	  
	 public List <Vehicle> getVahicle(){
			return repo.findAll();
	 }
	 @GetMapping("/getVahiclebyId/{}")
		public Vehicle getVahicleByvahicleId(@PathVariable Integer Id){	
			return repo.findById(Id).get();	
	 }
	 @GetMapping("/getVehiclebyvehicleNm/{vehicleNm}")
		public List<Vehicle> getVehicleByvehicleNm(@PathVariable String Nm){
			return repo.findByvehicleNm(Nm);
		}
		
	
}
