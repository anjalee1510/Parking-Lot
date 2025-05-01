package com.example.parkinglot.models;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingLot {
	String name;
	String address;
	List<ParkingSlot> parkingSlots;
	List<Gate> entryGates;
	List<Gate> exitGates;

}
