package com.mock.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.services.ClubService;

import jakarta.validation.Valid;



@Controller
public class ClubController {
	
	private ClubService clubService;

	@Autowired
	public ClubController(ClubService clubService) {
		super();
		this.clubService = clubService;
	}
	
	@GetMapping("/clubs")
	public String listClubs(Model model) {
		List<ClubDto> clubs = clubService.findAllClubs();
		model.addAttribute("clubs", clubs);
		// Will return a html file named clubs-list.html
		return "clubs-list";
	}
	
	@GetMapping("/clubs/new")
	public String createClubForm(Model model) {
		Club club = new Club();
		model.addAttribute("club", club);
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
	public String editClubForm(@PathVariable("clubId")Long clubId, Model model) {
		ClubDto club = clubService.findById(clubId);
		model.addAttribute("club",club);
		return "clubs-detail";
	}
	
	@PostMapping("/clubs/{clubId}/edit")
	public String updateClub(@PathVariable("clubId") Long clubId, 
							 @Valid @ModelAttribute("club") ClubDto club,
							 BindingResult result) {
		if (result.hasErrors()) {
			return "clubs-edit";
		}
		club.setId(clubId);
		clubService.updateClub(club);
		return "redirect:/clubs";
	}
	
	@GetMapping("/clubs/{clubId}")
	public String getClubs (@PathVariable("clubId") Long clubId, Model model) {
		ClubDto club = clubService.findById(clubId);
		model.addAttribute("club", club);
		return "clubs-detail";
	}
	
	@GetMapping("/clubs/{clubId}/delete")
	public String deleteClub (@PathVariable("clubId") Long clubId) {
		clubService.deleteClub(clubId);
		return "redirect:/clubs";
	}
}
