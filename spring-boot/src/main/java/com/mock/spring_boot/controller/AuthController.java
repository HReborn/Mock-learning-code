package com.mock.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mock.spring_boot.dto.RegistrationDto;
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
		boolean fieldsNotEmpty = !result.hasFieldErrors();
		if (fieldsNotEmpty) {
			checkUserUniqueness(registrationDto, result);
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
	
	// I opted to extract the method to avoid a floating variable and to avoid nesting
	// because emailExists might still be false because we never checked DB
	// because the check would only happen if the fields are not empty, but the email and username might still be registered.
	// The meaning of the variable emailExists is ambiguous because it could be false if the email isn't registered but also if we never checked DB because the validation failed.
	// Single responsibility of Variables: A variable should represent one clear, unambiguous state.
	private void checkUserUniqueness(RegistrationDto registrationDto, BindingResult result) {
		boolean emailRegistered = userService.findByEmail(registrationDto.getEmail()) != null;
		boolean userRegistered = userService.findByUsername(registrationDto.getUsername()) != null;
		if (emailRegistered || userRegistered) {
			String errorMessage = "An account already exists for this email/username.";
			result.rejectValue("username", "error.user", errorMessage);
			result.rejectValue("email", "error.user", errorMessage);
		}
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
