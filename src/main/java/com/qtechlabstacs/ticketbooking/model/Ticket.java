package com.qtechlabstacs.ticketbooking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private Long ticketId;

	// Passenger Info
	private String firstName;
	private String lastName;
	private int age;
	private String gender; // MALE, FEMALE;
	private String mobileNumber;

	// Amount Info
	private int ticketAmount;

	// Seat Info
	private Long coachNumber;
	private String coachCategory; // SL, AC;
	private Long berthNumber;
	private String berthType; // UPPPER, LOWER, MIDDLE, SIDE_LOWER, SIDE_UPPER;

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	public Long getCoachNumber() {
		return coachNumber;
	}

	public void setCoachNumber(Long coachNumber) {
		this.coachNumber = coachNumber;
	}

	public String getCoachCategory() {
		return coachCategory;
	}

	public void setCoachCategory(String coachCategory) {
		this.coachCategory = coachCategory;
	}

	public Long getBerthNumber() {
		return berthNumber;
	}

	public void setBerthNumber(Long berthNumber) {
		this.berthNumber = berthNumber;
	}

	public String getBerthType() {
		return berthType;
	}

	public void setBerthType(String berthType) {
		this.berthType = berthType;
	}

}
