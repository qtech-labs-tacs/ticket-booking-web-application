package com.qtechlabstacs.ticketbooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Train {
	
	// Train Info
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long trainId;
	private String trainName;
	
	//Station Info
	private String from;   // DELHI, AGRA, GWALIOR, JHANSI,  BHOPAL, PUNE, GOA
	private String to;	   // DELHI, AGRA, GWALIOR, JHANSI,  BHOPAL, PUNE, GOA
	
	
	//Running Info
	private boolean onMon;
	private boolean onTue;
	private boolean onWeb;
	private boolean onThu;
	private boolean onFri;
	private boolean onSat;
	private boolean onSun;

	@OneToMany
	private List<Stop> stops;		// NO COLOUMN CAN BE MAPPED IN REALTIONAL DATABASE TABLE 		// 
	
	@OneToMany
	private List<Coach> coaches;  // NO COLOUMN CAN BE MAPPED IN REALTIONAL DATABASE TABLE			//

	public Long getTrainId() {
		return trainId;
	}

	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
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

	public List<Stop> getStops() {
		return stops;
	}

	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}

	public boolean isOnMon() {
		return onMon;
	}

	public void setOnMon(boolean onMon) {
		this.onMon = onMon;
	}

	public boolean isOnTue() {
		return onTue;
	}

	public void setOnTue(boolean onTue) {
		this.onTue = onTue;
	}

	public boolean isOnWeb() {
		return onWeb;
	}

	public void setOnWeb(boolean onWeb) {
		this.onWeb = onWeb;
	}

	public boolean isOnThu() {
		return onThu;
	}

	public void setOnThu(boolean onThu) {
		this.onThu = onThu;
	}

	public boolean isOnFri() {
		return onFri;
	}

	public void setOnFri(boolean onFri) {
		this.onFri = onFri;
	}

	public boolean isOnSat() {
		return onSat;
	}

	public void setOnSat(boolean onSat) {
		this.onSat = onSat;
	}

	public boolean isOnSun() {
		return onSun;
	}

	public void setOnSun(boolean onSun) {
		this.onSun = onSun;
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}
	
	
	
	
	
}
