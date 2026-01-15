package com.mock.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mock.spring_boot.dto.ClubDto;
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
	

}
