package com.parking.api.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmailOrPhoneNumber(String email, String phoneNumber);

	boolean existsByEmail(String email);

	boolean existsByPhoneNumber(String phoneNumber);

}
