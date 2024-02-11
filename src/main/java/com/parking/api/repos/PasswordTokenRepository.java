package com.parking.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.models.PasswordToken;

public interface PasswordTokenRepository extends JpaRepository<PasswordToken, Long> {

}
