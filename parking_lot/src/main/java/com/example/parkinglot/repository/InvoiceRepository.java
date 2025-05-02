package com.example.parkinglot.repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.example.parkinglot.models.Gate;
import com.example.parkinglot.models.Invoice;
import com.example.parkinglot.models.Ticket;

@Repository
public class InvoiceRepository {
	
	private final Map<Long, Invoice> invoices=new HashMap<>();
	private final AtomicLong idGenerator= new AtomicLong(1);
	
	public Invoice findById(Long id) {
		return invoices.get(id);
	}
	
	public Invoice save(int amount, Ticket ticket, Gate gate) {
		Long id=idGenerator.getAndIncrement();
		Invoice invoice1=Invoice.builder()
				.id(idGenerator.getAndIncrement())
				.amount(amount)
				.ticket(ticket)
				.gate(gate)
				.operatorId(gate.getOperatorId())
				.exitTime(LocalDate.now())
				.build();
		invoices.put(id,  invoice1);
		return invoice1;
	}
	
	public Map<Long, Invoice> findAll(){
		return invoices;
	}

}
