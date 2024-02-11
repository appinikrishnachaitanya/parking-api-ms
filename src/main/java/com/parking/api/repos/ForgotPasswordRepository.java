package com.parking.api.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.models.PasswordToken;

public interface ForgotPasswordRepository extends JpaRepository<PasswordToken, Long> {
	
	 Optional<PasswordToken> findByUsername(String name);

}
