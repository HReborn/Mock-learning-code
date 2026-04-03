package com.mock.spring_boot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


// this annotation will act as a global try-catch for the @Controller annotation
// It'll handle all exceptions
// @RestControllerAdvice is for APIs because it returns JSON and this one returns views
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResponseStatusException.class)
	public String handleNotFound(ResponseStatusException ex, 
								 RedirectAttributes redirectAttributes) {
		
		if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
			// Using this is Spring's way of adding an attribute that survives a redirect.
			// Stores it on a temporary flash map. But for it to work you NEED to use "	redirect:".
			// It's lifetime is only one redirect, only one next request.
			
			redirectAttributes.addFlashAttribute(
		            "errorMessage",
		            "The page you are trying to access does not exist."
		        );
			return "redirect:/";
		}
		throw ex; // Let other status codes pass
	}
}