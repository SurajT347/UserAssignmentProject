package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Vehicle {
   
	   @Id
	   private int vehicleId;
	   private String vehicleNm; 
	   private int Feedback;
	   
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vehicleId, String vehicleNm, int feedback) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleNm = vehicleNm;
		Feedback = feedback;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleNm=" + vehicleNm + ", Feedback=" + Feedback + "]";
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleNm() {
		return vehicleNm;
	}

	public void setVehicleNm(String vehicleNm) {
		this.vehicleNm = vehicleNm;
	}

	public int getFeedback() {
		return Feedback;
	}

	public void setFeedback(int feedback) {
		Feedback = feedback;
	}
	
	   
	   
	
	   
	
	   
	   
	   
}
