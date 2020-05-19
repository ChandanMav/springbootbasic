package cta.accenture.com.graph.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import cta.accenture.com.graph.exception.ApplicationError;
import cta.accenture.com.graph.exception.PersonNotFoundException;

@ControllerAdvice
@RestController
public class ErrorHandler {
	
	@Value("${api_doc_url}")
	private String details;

	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<ApplicationError> handlePersonNotFoundException(PersonNotFoundException exception, WebRequest webRequest){
		ApplicationError error = new ApplicationError();
		error.setCode(101);
		error.setMessage(exception.getMessage());
		error.setDetails(details);
		return new ResponseEntity<ApplicationError>(error, HttpStatus.NOT_FOUND);
	}
}
