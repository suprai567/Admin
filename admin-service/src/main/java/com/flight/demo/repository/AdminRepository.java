package com.flight.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.flight.demo.entity.Flight;

public interface AdminRepository extends CrudRepository<Flight, Integer>{

}
