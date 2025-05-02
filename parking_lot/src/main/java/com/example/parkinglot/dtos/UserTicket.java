package com.example.parkinglot.dtos;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UserTicket {
	Long ticketId;
	Long slotId;
	Long gateId;
	int floorNumber;
	LocalDate time; 

}
