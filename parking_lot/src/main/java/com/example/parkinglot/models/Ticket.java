package com.example.parkinglot.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {
	Long id;
	int operatorId;
	Gate gate;
	Vehicle vehicle;
	ParkingSlot parkingSlot;
	LocalDate issueTime;
	
	
	
//	public Ticket() {
//		super();
//	}
//	
//	public Ticket(int operatorId, Gate gate, Vehicle vehicle, ParkingSlot parkingSlot, LocalDate issueTime) {
//		super();
//		this.operatorId = operatorId;
//		this.gate = gate;
//		this.vehicle = vehicle;
//		this.parkingSlot = parkingSlot;
//		this.issueTime = issueTime;
//	}
//	public int getOperatorId() {
//		return operatorId;
//	}
//	public void setOperatorId(int operatorId) {
//		this.operatorId = operatorId;
//	}
//	public Gate getGate() {
//		return gate;
//	}
//	public void setGate(Gate gate) {
//		this.gate = gate;
//	}
//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
//	public ParkingSlot getParkingSlot() {
//		return parkingSlot;
//	}
//	public void setParkingSlot(ParkingSlot parkingSlot) {
//		this.parkingSlot = parkingSlot;
//	}
//	public LocalDate getIssueTime() {
//		return issueTime;
//	}
//	public void setIssueTime(LocalDate issueTime) {
//		this.issueTime = issueTime;
//	}
//	
	
	
	
}
  