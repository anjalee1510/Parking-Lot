package com.example.parkinglot.strategy;

import java.util.List;

import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSlot;
import com.example.parkinglot.models.SlotState;
import com.example.parkinglot.models.Vehicle;

public interface SlotFindingStrategy {
	ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle);
		
		
		
}
