package com.example.demoService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoEntity.FlightEntity;

@Service
public interface FlightService {
	
	List<FlightEntity> CreateData();

}
