package com.parking.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntryPointRequest {

	private String gateNo;
	private long available;
	private long twoWheeler;
	private long fourWheeler;
	private long heavyVehicles;

}
