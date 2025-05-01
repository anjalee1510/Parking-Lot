package com.example.parkinglot.service;

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
	
	public InvoiceService(InvoiceRepository invoiceRepository,TicketRepository ticketRepository,GateRepository gateRepository) {
		this.invoiceRepository=invoiceRepository;
		this.gateRepository=gateRepository;
		this.ticketRepository=ticketRepository;
		this.fareCalculationStrategy = null;
	}
	
	public Invoice generateInvoice(Long ticketId, Long gateId) {
		// 1. Fetch the ticket object from the DB for the ticket ID
		// 2. Fetch the gate from the DB
		// 3. Based on a strategy, calculate the amount due
		// 4. Free up the parking slot
		// 5. Return the invoice object.
		
		Ticket ticket=ticketRepository.findById(ticketId);
		Gate gate=gateRepository.findById(gateId);
		
		int amount=0;
		ParkingSlot parkingSlot=ticket.getParkingSlot();
		parkingSlot.setVehicle(null);
		parkingSlot.setSlotState(SlotState.FREE);
		// Invoice for the request
		
		
		
		return null;
	}
}
