package com.mock.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.services.EventService;

@Controller
public class EventController {
	
	private EventService eventService;

	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	
	@GetMapping("/events")
	public String listEvents(Model model) {
		model.addAttribute("events", eventService.findAllEvents());
		return "events-list";
	}
	
	@GetMapping("/events/{clubId}/new")
	public String createEvent(@PathVariable Long clubId, Model model ) {
		Event event = new Event();
		model.addAttribute("clubId", clubId);
		model.addAttribute("event", event);
		return "events-create";
	}
	
	@PostMapping("/events/{clubId}")
	public String saveEvent(@PathVariable Long clubId, 
			Model model, 
			@ModelAttribute("event") EventDto eventDto ) {
		eventService.createEvent(clubId, eventDto);
		return "redirect:/clubs/" + clubId;
	}
}
