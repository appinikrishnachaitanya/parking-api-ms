package com.parking.api.models;

import com.parking.api.constants.VehicleType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "parkingspots_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String parkingSpotName;
	private int floornumber;
	private boolean status;
	@Enumerated(EnumType.STRING)
	private VehicleType vehicleType;

}
