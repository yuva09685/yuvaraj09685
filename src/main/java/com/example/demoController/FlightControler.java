package com.example.demoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoEntity.FlightEntity;
import com.example.demoServiceimpl.FlightServiceimpl;

@RestController
public class FlightControler {
	
	@Autowired FlightServiceimpl impl;
	@GetMapping(value = "/Flight")
	private List<FlightEntity> getall() {
		List<FlightEntity> Data = impl.CreateData();
		return Data;
          
	}
	
	

}
