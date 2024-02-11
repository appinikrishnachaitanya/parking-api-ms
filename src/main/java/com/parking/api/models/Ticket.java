package com.parking.api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tickets_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private ParkingSpot parkingSpot;
	@OneToOne
	private Vehicle vehicle;
	private LocalDateTime open;
	private String status;
	private LocalDateTime closed;
	private double price;

}
