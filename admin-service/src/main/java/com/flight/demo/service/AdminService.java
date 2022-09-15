package com.flight.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.demo.entity.Flight;
import com.flight.demo.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;
	
	public Flight save(Flight flight) {
		adminRepository.save(flight);
		return flight;
	}
	
	public Iterable<Flight> getAllFlights(){
		return adminRepository.findAll();
		
	}

}
