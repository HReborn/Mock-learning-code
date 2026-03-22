package com.mock.spring_boot;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpSession;

@ControllerAdvice
public class GlobalViewAttributes {
	
	// This method here will work as a clean up. @ModelAttribute will run before every request.
	// To remove the session sideeffect.
	@ModelAttribute
	public void flash(HttpSession session, Model model) {
	    String msg = (String) session.getAttribute("errorMessage");
	    if (msg != null) {
	        model.addAttribute("errorMessage", msg); // expose
	        session.removeAttribute("errorMessage"); // cleanup
	        System.out.println("Estou sendo removido corretamente");
	    }
	}
}
