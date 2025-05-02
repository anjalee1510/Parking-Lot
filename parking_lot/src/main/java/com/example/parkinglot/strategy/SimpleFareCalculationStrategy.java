package com.example.parkinglot.strategy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Component;

@Component
public class SimpleFareCalculationStrategy implements FareCalculationStrategy {

	private static final int DAILY_RATE= 100;
	@Override
	public int getFare(LocalDate entryTime, LocalDate exitTime) {
		long days=ChronoUnit.DAYS.between(entryTime, exitTime);
		if(days<=0) {
			days=1; // Minimum charge for same day
		}
		
		return (int) days* DAILY_RATE;
	}

}
