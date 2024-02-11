package com.parking.api.service;

import com.parking.api.dtos.PasswordUpdate;
import com.parking.api.dtos.UserRequest;
import com.parking.api.response.UserResponse;

public interface IUserService {

	public String createUser(UserRequest userRequest);

	public UserResponse getUserById(long id);

	public String forgotPassword(String username);
	
	public String updatePassword(PasswordUpdate passwordUpdate);

}
