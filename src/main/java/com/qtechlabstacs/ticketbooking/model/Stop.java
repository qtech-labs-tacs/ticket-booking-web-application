package com.qtechlabstacs.ticketbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stopId;
	private String stopNumber;
	private String stationNumber;
	private String stationName;
	private String timeOfArrival;
	private String timeOfDeparture;
	private Long trainId;

	public String getStopNumber() {
		return stopNumber;
	}

	public void setStopNumber(String stopNumber) {
		this.stopNumber = stopNumber;
	}

	public Long getStopId() {
		return stopId;
	}

	public void setStopId(Long stopId) {
		this.stopId = stopId;
	}

	public Long getTrainId() {
		return trainId;
	}

	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}

	public String getStationNumber() {
		return stationNumber;
	}

	public void setStationNumber(String stationNumber) {
		this.stationNumber = stationNumber;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getTimeOfArrival() {
		return timeOfArrival;
	}

	public void setTimeOfArrival(String timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}

	public String getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(String timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

}
