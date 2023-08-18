package com.qtechlabstacs.ticketbooking.dto;

import java.io.Serializable;

public class TicketBookingDTO implements Serializable{

	private static final long serialVersionUID = 6319173073961011131L;

	private String from;
	private String to;
	private long trainNumber;
	private long numberOfBerth;
	private String coachCategory; // class
	private String travellingDate;

	
	public Long getNumberOfBerth() {
		return numberOfBerth;
	}

	public void setNumberOfBerth(Long numberOfBerth) {
		this.numberOfBerth = numberOfBerth;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(Long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getCoachCategory() {
		return coachCategory;
	}

	public void setCoachCategory(String coachCategory) {
		this.coachCategory = coachCategory;
	}

	public String getTravellingDate() {
		return travellingDate;
	}

	public void setTravellingDate(String travellingDate) {
		this.travellingDate = travellingDate;
	}


}
