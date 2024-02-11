package com.parking.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

	private long id;
	private String name;
	private String password;
	private String email;
	private String phoneNumber;
}
