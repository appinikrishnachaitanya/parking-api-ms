package com.parking.api.response;

import java.util.Set;

import com.parking.api.models.ParkingSpot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryGateResponse {
	private long id;
	private String gateNo;
	private boolean status;
	Set<ParkingSpot> parkingSpots;
}
