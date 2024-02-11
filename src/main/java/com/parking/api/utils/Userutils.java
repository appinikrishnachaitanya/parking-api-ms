package com.parking.api.utils;

import org.modelmapper.ModelMapper;

import com.parking.api.dtos.UserRequest;
import com.parking.api.models.User;
import com.parking.api.response.UserResponse;

public class Userutils {

	public static final ModelMapper modelMapper = new ModelMapper();

	public static UserResponse convertEntityToResponse(User user) {

		return modelMapper.map(user, UserResponse.class);
	}

	public static User convertRequestToEntity(UserRequest userRequest) {

		return modelMapper.map(userRequest, User.class);
	}

}
