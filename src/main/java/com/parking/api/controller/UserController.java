package com.parking.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parking.api.dtos.PasswordUpdate;
import com.parking.api.dtos.UserRequest;
import com.parking.api.response.UserResponse;
import com.parking.api.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user/api/v1")
public class UserController {

	private final UserServiceImpl userService;

	public UserController(UserServiceImpl userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody UserRequest userRequest) {

		return new ResponseEntity<>(this.userService.createUser(userRequest), HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<UserResponse> getUserById(@PathVariable long id) {

		return new ResponseEntity<>(this.userService.getUserById(id), HttpStatus.OK);

	}

	@PostMapping("/forgotpassword")
	public ResponseEntity<String> forgotpassword(@RequestParam(name = "username", required = true) String username) {
		return new ResponseEntity<>(this.userService.forgotPassword(username), HttpStatus.OK);
	}

	@PostMapping("/updatepassword")
	public ResponseEntity<String> forgotpassword(@RequestBody PasswordUpdate passwordUpdate) {
		return new ResponseEntity<>(this.userService.updatePassword(passwordUpdate), HttpStatus.OK);
	}

}
