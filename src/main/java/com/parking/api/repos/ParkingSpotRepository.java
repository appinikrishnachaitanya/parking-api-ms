package com.parking.api.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.models.ParkingSpot;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {

	Optional<ParkingSpot> findByParkingSpotName(String spotName);

}
