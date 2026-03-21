package com.mock.spring_boot;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import jakarta.servlet.http.HttpSession;

// this annotation will act as a global try-catch for the @Controller annotation
// It'll handle all exceptions
// @RestControllerAdvice is for APIs because it returns JSON and this one returns views
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResponseStatusException.class)
	public String handleNotFound(HttpSession session, ResponseStatusException ex, Model model) {
		if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
			session.setAttribute("errorMessage",  "The page you are trying to access, does not exist.");
			return "redirect:/";
		}
		throw ex; // Let other status codes pass
	}
}