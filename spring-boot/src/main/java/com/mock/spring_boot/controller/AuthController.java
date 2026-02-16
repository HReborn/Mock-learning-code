package com.mock.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		RegistrationDto registrationDto = new RegistrationDto();
		model.addAttribute("user", registrationDto);
		return "register";
	}
	
	@PostMapping("/register/save")
	public String registerUser(
								Model model, 
								@Valid @ModelAttribute("user") RegistrationDto registrationDto, 
								BindingResult result) {
		UserEntity existingEmail = userService.findByEmail(registrationDto.getEmail());
		UserEntity existingUsername = userService.findByUsername(registrationDto.getUsername());
		if (existingEmail != null || existingUsername != null) {
			result.rejectValue("username", "error.user", "An account already exists for this email/username.");
			result.rejectValue("email", "error.user", "An account already exists for this email/username.");
		}
		if (result.hasErrors()) {
			model.addAttribute("user", registrationDto);
			//return "redirect:/register?registerFailed";
			return "register";
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
