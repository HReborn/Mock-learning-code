package com.mock.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.services.ClubService;



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
	public String saveClub (@ModelAttribute("club") Club club) {
		clubService.saveClub(club);
		return "redirect:/clubs";
	}
}
