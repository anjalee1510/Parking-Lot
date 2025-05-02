package com.example.parkinglot.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.example.parkinglot.models.Ticket;

@Repository
public class TicketRepository {
	
	private final Map<Long, Ticket> tickets=new HashMap<>();
	private final AtomicLong idGenerator= new AtomicLong(1);
	
	// 
	
	public Ticket findById(Long id) {
		//
		return tickets.get(id);
	}
	
	public Ticket save(Ticket ticket) {
		//save the ticket
		Long id=idGenerator.getAndIncrement();
		ticket.setId(id);
		tickets.put(id, ticket);
		return ticket;
		
	}
	
	public Map<Long, Ticket> findAll(){
		return tickets;
	}

}
