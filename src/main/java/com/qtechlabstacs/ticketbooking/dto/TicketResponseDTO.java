package com.qtechlabstacs.ticketbooking.dto;

public class TicketResponseDTO {

	private long ticketNumber;
	private String status;

	public Long getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Long ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
