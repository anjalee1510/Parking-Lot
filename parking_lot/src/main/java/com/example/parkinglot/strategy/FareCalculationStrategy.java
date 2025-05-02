package com.example.parkinglot.strategy;

import java.time.LocalDate;

public interface FareCalculationStrategy {
	
	int getFare(LocalDate entryTime, LocalDate exitTime);

}
