package com.parking.api.service;

import com.parking.api.dtos.EntryPointRequest;
import com.parking.api.models.ParkingSpot;

public interface IParkingSpotService {

	public String createParkingSpots(EntryPointRequest entrypointRequest);

	public ParkingSpot getParkingSpotByName(String name);

	public ParkingSpot getParkingSpotById(long id);

	public String updateStatusForParkingSpot(long id, String status);
	
	public String updateStatusForEntryGate(long id ,String status);
	
	

}
