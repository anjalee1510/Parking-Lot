package com.example.parkinglot.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Gate {
	
	Long id;
	GateType gateType;
	int operatorId;
	ParkingLot parkingLot;

}
