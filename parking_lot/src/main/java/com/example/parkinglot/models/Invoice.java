package com.example.parkinglot.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
	
	Long id;
	int amount;
	Ticket ticket;
	LocalDate exitTime;
	Gate gate;
	int operatorId;

}
