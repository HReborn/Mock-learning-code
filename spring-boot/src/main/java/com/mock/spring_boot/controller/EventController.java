package com.mock.spring_boot.controller;

import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.services.EventService;
import com.mock.spring_boot.services.UserService;

import jakarta.validation.Valid;

@Controller
public class EventController {
	
	private EventService eventService;
	private UserService userService;
	
	public EventController(EventService eventService, UserService userService) {
		super();
		this.eventService = eventService;
		this.userService = userService;
	}
	
	private UserEntity getCurrentUser() {
		UserEntity currentUser = userService.findByUsername(getSessionUsername());
		return currentUser;
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
		boolean isEventOwner = false;
		// Must check if session user is null because currentUser will be null too and it'll give a runtime exception
		if (getSessionUsername() != null && getCurrentUser().getId() == event.getCreatedBy().getId()) {
			isEventOwner = true;
		}
		model.addAttribute("isEventOwner", isEventOwner);
		model.addAttribute("event", event);
		model.addAttribute("club", event.getClub());
		return "events-detail";
	}
	
	@GetMapping("/events/{eventId}/edit")
	public String editEvent(@PathVariable Long eventId, Model model) {
		model.addAttribute("event", eventService.findEventById(eventId));
		return "events-edit";
	}
	
	@PostMapping("/events/{eventId}/edit")
	public String updateEvent(@PathVariable Long eventId, 
							  @Valid @ModelAttribute EventDto event,
							  BindingResult result) {
		if (result.hasErrors()) {
			return "event-edit";
		}
		eventService.updateEvent(event);
		return "redirect:/events/" + eventId;
	}
	
	@PostMapping("/events/{clubId}")
	public String saveEvent(@PathVariable Long clubId, 
			Model model, 
			@ModelAttribute("event") EventDto eventDto ) {
		eventService.createEvent(clubId, eventDto);
		return "redirect:/clubs/" + clubId;
	}
	
	@GetMapping("/events/{eventId}/delete")
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
