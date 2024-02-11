package com.parking.api.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "entruypoints_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EntryPoint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true)
	private String gateNo;
	private boolean status;
	private long total;
	private long available;
	private long remaining;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Set<ParkingSpot> parkingSpots;

}
