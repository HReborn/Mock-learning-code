package com.mock.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.dto.EventEditDto;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.services.ClubService;
import com.mock.spring_boot.services.EventService;
import com.mock.spring_boot.services.UserService;

import jakarta.validation.Valid;

@Controller
public class EventController {
	
	private EventService eventService;
	private UserService userService;
	private ClubService clubService;
	
	public EventController(EventService eventService, UserService userService, ClubService clubService) {
		super();
		this.eventService = eventService;
		this.userService = userService;
		this.clubService = clubService;
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
	
	@GetMapping("/events/{eventId}")
	public String getEvent(@PathVariable Long eventId, Model model) {
		EventDto event = eventService.findEventById(eventId);
		model.addAttribute("canEditEvent", eventService.canCurrentUserEditEvent(event));
		model.addAttribute("event", event);
		model.addAttribute("club", clubService.findById(event.getClubId()));
		return "events-detail";
	}
	
	@GetMapping("/events/{eventId}/edit")
	public String editEvent(@PathVariable Long eventId, Model model) {
		model.addAttribute("event", eventService.findEventById(eventId));
		return "events-edit";
	}
	
	@PostMapping("/events/{eventId}/edit")
	public String updateEvent(@PathVariable Long eventId, 
							  @Valid @ModelAttribute EventEditDto event,
							  BindingResult result) {
		if (result.hasErrors()) {
			return "event-edit";
		}
		event.setEventId(eventId);
		eventService.updateEvent(event);
		return "redirect:/events/" + eventId;
	}
	
	@PostMapping("/events/{clubId}")
	public String saveEvent(@PathVariable Long clubId, 
			Model model, 
			@ModelAttribute("event") EventDto eventDto ) {
		eventDto.setCreatedByUsername(userService.getCurrentUser().getUsername());
		eventService.createEvent(clubId, eventDto);
		return "redirect:/clubs/" + clubId;
	}
	
	@PostMapping("/events/{eventId}/delete")
	public String deleteEvent(@PathVariable Long eventId) {
		eventService.deleteEvent(eventId);
		return "redirect:/events";
	}
	
	@GetMapping("/events/search")
	public String searchEvents(String query, Model model) {
		model.addAttribute("events", eventService.searchEvent(query));
		return "events-list";
	}
}
