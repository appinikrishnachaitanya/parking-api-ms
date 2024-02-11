package com.parking.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

	@NotBlank(message="it is Mandatory Field")
	private String name;
	@NotBlank(message="it is Mandatory Field")
	private String password;
	@NotBlank(message="it is Mandatory Field")
	private String email;
	@NotBlank(message="it is Mandatory Field")
	private String phoneNumber;
}
