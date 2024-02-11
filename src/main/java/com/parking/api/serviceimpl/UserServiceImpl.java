package com.parking.api.serviceimpl;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.parking.api.dtos.PasswordUpdate;
import com.parking.api.dtos.UserRequest;
import com.parking.api.exceptions.UserAlreadyExistException;
import com.parking.api.models.PasswordToken;
import com.parking.api.models.User;
import com.parking.api.repos.ForgotPasswordRepository;
import com.parking.api.repos.UserRepository;
import com.parking.api.response.UserResponse;
import com.parking.api.service.IUserService;
import com.parking.api.utils.Userutils;

@Service
public class UserServiceImpl implements IUserService {

	private final UserRepository userRepository;

	private final ForgotPasswordRepository passwordtokenRepository;

	public UserServiceImpl(UserRepository userRepository, ForgotPasswordRepository passwordtokenRepository) {
		this.userRepository = userRepository;
		this.passwordtokenRepository = passwordtokenRepository;
	}

	private boolean checkAlreadyExistUser(UserRequest userRequest) {
		return this.userRepository.existsByEmail(userRequest.getEmail())
				|| this.userRepository.existsByPhoneNumber(userRequest.getPhoneNumber());
	}

	@Override
	public String createUser(UserRequest userRequest) {

		if (checkAlreadyExistUser(userRequest)) {
			throw new UserAlreadyExistException("User Already Exception");
		} else {
			User user = Userutils.convertRequestToEntity(userRequest);
			this.userRepository.save(user);

			return "User Created Successfully";

		}
	}

	@Override
	public UserResponse getUserById(long id) {

		User user = this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
		return Userutils.convertEntityToResponse(user);
	}

	@Override
	public String forgotPassword(String username) {

		if (this.userRepository.existsByEmail(username) || this.userRepository.existsByPhoneNumber(username)) {
			PasswordToken pt = new PasswordToken();
			pt.setUsername(username);
			Long t = LocalTime.now().toNanoOfDay();
			pt.setToken(t.toString().substring(0, 4));
			pt.setCreatedAt(LocalDateTime.now());
			pt.setValidAt(LocalDateTime.now().plusMinutes(5));
			this.passwordtokenRepository.save(pt);

			return "Token sent to you Successfully , Please check your mail";
		}

		else {
			throw new RuntimeException("User not found....");
		}
	}

	@Override
	public String updatePassword(PasswordUpdate passwordUpdate) {

		User user = this.userRepository
				.findByEmailOrPhoneNumber(passwordUpdate.getUsername(), passwordUpdate.getUsername())
				.orElseThrow(() -> new RuntimeException("user not found"));
		PasswordToken passwordToken = this.passwordtokenRepository.findByUsername(user.getEmail()).get();
		if (passwordToken.getToken().equals(passwordUpdate.getToken())
				&& passwordToken.getValidAt().isBefore(LocalDateTime.now())) {
			user.setPassword(passwordUpdate.getPassword());
			this.userRepository.save(user);
		} else {

			throw new RuntimeException("Token is Invalid or Expired");

		}

		return "User Password Updated Successfully";
	}

}
