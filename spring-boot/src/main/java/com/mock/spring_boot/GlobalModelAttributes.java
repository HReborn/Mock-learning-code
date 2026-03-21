package com.mock.spring_boot;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpSession;

// This annotation means that every request from any controller will trigger these methods because of the @ModelAttribute
// The @ModelAttribute makes it so that it will run before the controllers and @ControllerAdvice makes this class apply to all controllers globally
// When adding model attributes globally, you're always gonna use the combo @ControllerAdvice + @ModelAttributes
@ControllerAdvice
public class GlobalModelAttributes {

	// You need to make a different method because you can't use it with the redirects from the exceptionHandler because the model discards the attributes.
	// Spring runs @ModelAttribute before the controller after. 
	// @ModelAtt-request-controller-@ExcpHandl-redirect-new request-@ModelAtt
	@ModelAttribute
	public void addflashMessage(HttpSession session, Model model) {
		String message = (String) session.getAttribute("errorMessage");
		if (message != null) {
			model.addAttribute("errorMessage", message);
			session.removeAttribute("errorMessage");
		}
	}
}
