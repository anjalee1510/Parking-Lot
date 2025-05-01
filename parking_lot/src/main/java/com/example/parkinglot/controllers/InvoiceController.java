package com.example.parkinglot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parkinglot.dtos.UserTicket;
import com.example.parkinglot.models.Invoice;
import com.example.parkinglot.service.InvoiceService;

@RestController
public class InvoiceController {
	
	//TODO: Change Invoice to DTO object
	private final InvoiceService invoiceService;
	
	public InvoiceController(InvoiceService invoiceService) {
		this.invoiceService=invoiceService;
	}
	@PostMapping("/invoice")
	public Invoice generateInvoice(UserTicket userTicket) {
		return invoiceService.generateInvoice(userTicket.getTicketId(),1L);
	}
}
