package com.example.demoServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demoEntity.FlightEntity;
import com.example.demoRepo.FlightRepository;
import com.example.demoService.FlightService;

@Component
public class FlightServiceimpl implements FlightService{
	
	@Autowired FlightRepository repo;

	@Override
	public List<FlightEntity> CreateData() {
		List<FlightEntity> all = repo.findAll();
		return all;
	}
    
}


