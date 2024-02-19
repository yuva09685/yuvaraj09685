package com.example.demoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoEntity.FlightEntity;

@Repository

public interface FlightRepository extends JpaRepository<FlightEntity, Integer>{

}
