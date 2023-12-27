package com.javaExpress.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(CategeroyNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(CategeroyNotFoundException ex) {
		ErrorResponse errorResponse = ErrorResponse.builder().timeStamp(LocalDateTime.now())
				.status(HttpStatus.BAD_REQUEST).code(HttpStatus.BAD_REQUEST.value()).message("Client Error")
				.deatils(Collections.singletonList(ex.getLocalizedMessage())).build();
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception ex) {
		ErrorResponse errorResponse = ErrorResponse.builder().timeStamp(LocalDateTime.now())
				.status(HttpStatus.INTERNAL_SERVER_ERROR).code(HttpStatus.INTERNAL_SERVER_ERROR.value())
				.message("Something went wrong ").deatils(Collections.singletonList(ex.getLocalizedMessage())).build();
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		
		ErrorResponse errorResponse=null;
		if(ex instanceof HttpRequestMethodNotSupportedException) {
			errorResponse = ErrorResponse.builder()
					.timeStamp(LocalDateTime.now())
					.status(HttpStatus.METHOD_NOT_ALLOWED)
					.code(HttpStatus.METHOD_NOT_ALLOWED.value())
					.message("invalid http method"+ex.getMessage())
					.deatils(Collections.singletonList(ex.getLocalizedMessage()))
					.build();
			return new ResponseEntity<>(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
		}
		else if(ex instanceof HttpMessageNotReadableException) {
			errorResponse = ErrorResponse.builder()
					.timeStamp(LocalDateTime.now())
					.status(HttpStatus.UNPROCESSABLE_ENTITY)
					.code(HttpStatus.UNPROCESSABLE_ENTITY.value())
					.message("malformed Json Data"+ex.getMessage())
					.deatils(Collections.singletonList(ex.getLocalizedMessage()))
					.build();
			return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			
		}
		return null;
	}
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		List<String>errorMessage=new ArrayList<>();
		List<ObjectError> errorsList = ex.getBindingResult().getAllErrors();
		for(ObjectError err:errorsList) {
			errorMessage.add(err.getDefaultMessage());
		}
		
		ErrorResponse errorResponse = ErrorResponse.builder()
				.timeStamp(LocalDateTime.now())
				.status(HttpStatus.BAD_REQUEST)
				.code(HttpStatus.BAD_REQUEST.value())
				.message("Client Error")
				.deatils(errorMessage)
				.build();
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

}
