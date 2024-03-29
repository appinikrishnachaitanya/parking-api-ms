package com.parking.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotResponse {

	private long id;
	private String parkingSpotName;
	private int floornumber;
	private boolean status;
}
