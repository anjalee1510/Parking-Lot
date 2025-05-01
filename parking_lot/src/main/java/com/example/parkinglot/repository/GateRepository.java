package com.example.parkinglot.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.parkinglot.models.Gate;
import com.example.parkinglot.models.GateType;
import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSlot;
import com.example.parkinglot.models.SlotState;
import com.example.parkinglot.models.SlotType;
import com.example.parkinglot.models.VehicleType;

@Repository
public class GateRepository {

	private final Map<Long, Gate> gates=fillGates();
	
	public Gate findById(long Id) {
		return gates.get(Id);
	}
	
	private static Map<Long, Gate> fillGates() {
		Map<Long,Gate> gates=new HashMap<>();
		ParkingSlot parkingSlot1=ParkingSlot.builder()
				.floor(1)
				.slotType(SlotType.NORMAL)
				.vehicleType(VehicleType.SUV)
				.id(1)
				.slotState(SlotState.FREE)
				.build();
		ParkingSlot parkingSlot2=ParkingSlot.builder()
				.floor(2)
				.slotType(SlotType.VIP)
				.vehicleType(VehicleType.SEDAN)
				.id(10)
				.slotState(SlotState.FREE)
				.build();
		ParkingLot parkingLot= ParkingLot.builder()
				.name("Ambience Mall")
				.address("Gurugram")
				.parkingSlots(List.of(parkingSlot1,parkingSlot2))
				.build();
		Gate gate1=Gate.builder()
				.id(1)
				.operatorId(1)
				.gateType(GateType.ENTRY)
				.parkingLot(parkingLot)
				.build();
			gates.put(1L, gate1);
			
			return gates;
	}
}
