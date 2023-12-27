package com.javaExpress.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ErrorResponse {

	private HttpStatus status; // BAD REQUEST
	private Integer code; // 400
	private String message; // Client side
	private List<String> deatils; // single error or multiple errors
	private LocalDateTime timeStamp;

}
