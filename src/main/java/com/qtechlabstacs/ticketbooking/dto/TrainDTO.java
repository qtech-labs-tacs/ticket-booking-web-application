package com.qtechlabstacs.ticketbooking.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

public class TrainDTO implements Serializable {

	private static final long serialVersionUID = -6540732733005408997L;

	// Train Info
	@Id
	private Long trainId;
	private String trainName;

	// Station Info
	private String from; // DELHI, AGRA, GWALIOR, JHANSI, BHOPAL, PUNE, GOA
	private String to; // DELHI, AGRA, GWALIOR, JHANSI, BHOPAL, PUNE, GOA

	// Running Info
	private boolean onMon;
	private boolean onTue;
	private boolean onWeb;
	private boolean onThu;
	private boolean onFri;
	private boolean onSat;
	private boolean onSun;

	private List<StopDTO> stops; // NO COLOUMN CAN BE MAPPED IN REALTIONAL DATABASE TABLE //

	private List<CoachDTO> coaches; // NO COLOUMN CAN BE MAPPED IN REALTIONAL DATABASE TABLE //

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

	public List<StopDTO> getStops() {
		return stops;
	}

	public void setStops(List<StopDTO> stops) {
		this.stops = stops;
	}

	public List<CoachDTO> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<CoachDTO> coaches) {
		this.coaches = coaches;
	}

}
