package com.flight.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private long flightNumber;
    private String airline;
    private String fromPlace;
    private String toPlace;
    private double ticketCost;
	public Flight(Integer id, long flightNumber, String airline, String fromPlace, String toPlace, double ticketCost) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.ticketCost = ticketCost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", flightNumber=" + flightNumber + ", airline=" + airline + ", fromPlace="
				+ fromPlace + ", toPlace=" + toPlace + ", ticketCost=" + ticketCost + "]";
	}
	
	
	
}
