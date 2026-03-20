package com.mock.spring_boot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.services.ClubService;
import com.mock.spring_boot.services.UserService;

import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;

import jakarta.validation.Valid;

@Controller
public class ClubController {
	
	private ClubService clubService;
	private UserService userService;

	public ClubController(ClubService clubService, UserService userService) {
		super();
		this.clubService = clubService;
		this.userService = userService;
	}
	
	private UserEntity getCurrentUser() {
		UserEntity currentUser = userService.findByUsername(getSessionUsername());
		if (currentUser == null) {
			
		}
		return currentUser;
	}
	
	@GetMapping({"/clubs", "/"})
	public String listClubs(Model model) {
		List<ClubDto> clubs = clubService.findAllClubs();
		UserEntity currentUser = getCurrentUser();
		if (currentUser != null) {
			model.addAttribute("currentUser", currentUser);
		}
		model.addAttribute("clubs", clubs);
		return "clubs-list";
	}
	
	@GetMapping("/clubs/new")
	public String createClubForm(Model model) {
		Club club = new Club();
		model.addAttribute("club", club);
		model.addAttribute("currentUser", getCurrentUser());
		return "create-club";
	}
	
	@PostMapping("/clubs/new")
	public String saveClub (@Valid @ModelAttribute("club") ClubDto clubDto,
							BindingResult result,
							Model model) {
		
		if (result.hasErrors()) {
			// I don't know why he didn't put the model on the club edit
			// Probably because the model var already existed and we were editing
			// on this one, it doesn't exist.
			model.addAttribute("club", clubDto);
			return "create-club";
		}
		clubService.saveClub(clubDto);
		return "redirect:/clubs";
	}
	
	@GetMapping("/clubs/{clubId}/edit")
	public String editClubForm(@PathVariable Long clubId, Model model) {
		ClubDto club = clubService.findById(clubId);
		model.addAttribute("currentUser", getCurrentUser());
		model.addAttribute("club",club);
		return "clubs-edit";
	}
	
	@PostMapping("/clubs/{clubId}/edit")
	public String updateClub(@PathVariable Long clubId, 
							 @Valid @ModelAttribute ClubDto club,
							 BindingResult result) {
		if (result.hasErrors()) {
			return "clubs-edit";
		}
		club.setId(clubId);
		clubService.updateClub(club);
		return "redirect:/clubs";
	}
	
	@GetMapping("/clubs/{clubId}")
	public String getClubs (@PathVariable Long clubId, Model model) {
		ClubDto club = clubService.findById(clubId);
		model.addAttribute("club", club);
		UserEntity currentUser = getCurrentUser();
		if (currentUser != null) {
			model.addAttribute("currentUser", currentUser);
		}
		return "clubs-detail";
	}
	
	@GetMapping("/clubs/{clubId}/delete")
	public String deleteClub (@PathVariable Long clubId) {
		clubService.deleteClub(clubId);
		return "redirect:/clubs";
	}
	
	@GetMapping("/clubs/search")
	public String searchClub(@RequestParam String query, Model model) {
		List<ClubDto> clubs = clubService.searchClubs(query);
		model.addAttribute("clubs", clubs);
		UserEntity currentUser = getCurrentUser();
		if (currentUser != null) {
			model.addAttribute("currentUser", currentUser);
		}
		return "clubs-list";
	}
}
