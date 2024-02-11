package com.parking.api.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "passwordtoken_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PasswordToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String token;
	private LocalDateTime createdAt;
	private LocalDateTime validAt;
}
