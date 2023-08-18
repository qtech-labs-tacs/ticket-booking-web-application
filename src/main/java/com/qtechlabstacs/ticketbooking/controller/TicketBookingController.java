package com.qtechlabstacs.ticketbooking.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qtechlabstacs.ticketbooking.dto.TicketBookingDTO;
import com.qtechlabstacs.ticketbooking.dto.TicketResponseDTO;

@RestController
public class TicketBookingController {

	
	@PostMapping("/api/v1/ticket")
	public TicketResponseDTO bookTicket(TicketBookingDTO ticketBookingDTO) {
		
		
		
		return null;
	}
	
	
	
}
