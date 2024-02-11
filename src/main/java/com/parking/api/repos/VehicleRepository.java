package com.parking.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
