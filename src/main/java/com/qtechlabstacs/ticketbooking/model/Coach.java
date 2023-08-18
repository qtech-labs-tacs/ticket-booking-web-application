package com.qtechlabstacs.ticketbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long coachId;
	private Long coachNumber;
	private String catergory; // SL, AC
	private Long totalSeats;
	private Long trainId;

	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}

	public Long getCoachNumber() {
		return coachNumber;
	}

	public void setCoachNumber(Long coachNumber) {
		this.coachNumber = coachNumber;
	}

	public String getCatergory() {
		return catergory;
	}

	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}

	public Long getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Long totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Long getTrainId() {
		return trainId;
	}

	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}

}
