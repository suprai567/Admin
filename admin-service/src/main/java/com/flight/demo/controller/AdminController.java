package com.flight.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.demo.entity.Flight;
import com.flight.demo.service.AdminService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController // spring bean
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping
	Iterable<Flight> getUser() {
		return adminService.getAllFlights();
	}
	
	@PostMapping
	Integer saveUser1(@RequestBody Flight flight) {
		adminService.save(flight);//mock
		return flight.getId();
	}
	
}
