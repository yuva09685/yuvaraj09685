package com.example.demoEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FLIGHTDATA")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightEntity {
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "COACH")
	private String Coach;
	@Column(name = "AMOUNT")
	private double Amount;
	

}
