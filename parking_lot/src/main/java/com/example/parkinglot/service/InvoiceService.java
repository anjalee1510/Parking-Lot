package com.example.parkinglot.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.parkinglot.models.Gate;
import com.example.parkinglot.models.Invoice;
import com.example.parkinglot.models.ParkingSlot;
import com.example.parkinglot.models.SlotState;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.repository.GateRepository;
import com.example.parkinglot.repository.InvoiceRepository;
import com.example.parkinglot.repository.TicketRepository;
import com.example.parkinglot.strategy.FareCalculationStrategy;

@Service
public class InvoiceService {
	
	private final InvoiceRepository invoiceRepository;
	private final TicketRepository ticketRepository;
	private final GateRepository gateRepository;
	
	private final FareCalculationStrategy fareCalculationStrategy;
	
	public InvoiceService(InvoiceRepository invoiceRepository,TicketRepository ticketRepository,GateRepository gateRepository,FareCalculationStrategy fareCalculationStrategy) {
		this.invoiceRepository=invoiceRepository;
		this.gateRepository=gateRepository;
		this.ticketRepository=ticketRepository;
		this.fareCalculationStrategy = fareCalculationStrategy;
	}
	
	public Invoice generateInvoice(Long ticketId, Long gateId) {
		// 1. Fetch the ticket object from the DB for the ticket ID
		// 2. Fetch the gate from the DB
		// 3. Based on a strategy, calculate the amount due
		// 4. Free up the parking slot
		// 5. Return the invoice object.
		
		Ticket ticket=ticketRepository.findById(ticketId);
		if(ticket == null) {
			throw new IllegalArgumentException("Ticket not found for ID: "+ticketId);
			
		}
		Gate gate=gateRepository.findById(gateId);
		if(gate == null) {
			throw new IllegalArgumentException("Gate not found for ID: "+ gateId);
		}
		
		int amount=fareCalculationStrategy.getFare(ticket.getIssueTime(),LocalDate.now());
//		int amount=fareCalculationStrategy.getFare();
		
		ParkingSlot parkingSlot=ticket.getParkingSlot();
		parkingSlot.setVehicle(null);
		parkingSlot.setSlotState(SlotState.FREE);
		// Invoice for the request
//		Invoice invoice=new Invoice();
//		invoice.setId(0L);
//		invoice.setAmount(amount);
//		invoice.setTicket(ticket);
//		invoice.setOperatorId(gate.getOperatorId());
//		invoice.setExitTime(LocalDate.now());
//		
		Invoice invoice=invoiceRepository.save(amount,ticket,gate);
		
		
		
		return invoice;
	}
}
