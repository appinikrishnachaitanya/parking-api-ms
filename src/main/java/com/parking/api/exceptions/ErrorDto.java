package com.parking.api.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {

	private String message;
	private String status;
	private String path;
	private LocalDateTime localDateTime;
}
