package com.mock.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mock.spring_boot.dto.RegistrationDto;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.services.UserService;

import jakarta.validation.Valid;

@Controller
public class AuthController {
	
	private UserService userService;
	
	public AuthController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/register")
	public String getRegisterForm(Model model) {
		// If there's an error in the registration form, the user will be redirected to the registration page with the error message.
		// This redirect will carry the user with the error message in the model.
		if (!model.containsAttribute("user")) {
	        model.addAttribute("user", new RegistrationDto());
	    }
		return "register";
	}
	
	@PostMapping("/register/save")
	public String registerUser(
								@Valid @ModelAttribute("user") RegistrationDto registrationDto, 
								BindingResult result,
								RedirectAttributes redirectAttributes) {
		UserEntity existingEmail = userService.findByEmail(registrationDto.getEmail());
		UserEntity existingUsername = userService.findByUsername(registrationDto.getUsername());
		if (existingEmail != null || existingUsername != null) {
			result.rejectValue("username", "error.user", "An account already exists for this email/username.");
			result.rejectValue("email", "error.user", "An account already exists for this email/username.");
		}
		if (result.hasErrors()) {
			// These two lines link the error from result to the registrationDto and make it available in the redirect.
			// This way, the url will remain http://localhost:8080/register and the error message will be shown on the registration page.
			redirectAttributes.addFlashAttribute("user", registrationDto);
			redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.user", result);
			return "redirect:/register?registerFailed";
		}
		userService.registerUser(registrationDto);
		// the ?success is a query parameter and will link to the view with th:if="${param.success}" to show a success message
		// on the clubs page. With this return, the URL becomes http://localhost:8080/clubs?success
		return "redirect:/clubs?success";
	}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "login";
	}
}
