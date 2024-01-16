package com.irctc.trainbookingsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "traininfo")
public class TrainEntity {
	
	@Id
	@Column(name = "trainnumber")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int trainnumber;
	String fromlocation;
	String tolocation;
	String bookingdate;
	String bookingclasses;
	String trainname;
	public int getTrainnumber() {
		return trainnumber;
	}
	public void setTrainnumber(int trainnumber) {
		this.trainnumber = trainnumber;
	}
	public String getFromlocation() {
		return fromlocation;
	}
	public void setFromlocation(String fromlocation) {
		this.fromlocation = fromlocation;
	}
	public String getTolocation() {
		return tolocation;
	}
	public void setTolocation(String tolocation) {
		this.tolocation = tolocation;
	}
	
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	
	public String getBookingclasses() {
		return bookingclasses;
	}
	public void setBookingclasses(String bookingclasses) {
		this.bookingclasses = bookingclasses;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	

}


