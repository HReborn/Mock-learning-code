package com.reborn.firstapi;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	private final OrderRepo orderRepo;
	private final OrderAssembler orderAssembler;
	public OrderController(OrderRepo orderRepo, OrderAssembler orderAssembler) {
		super();
		this.orderRepo = orderRepo;
		this.orderAssembler = orderAssembler;
	}
	
	@GetMapping("/orders")
	CollectionModel<EntityModel<Order>> all() {
		
		return null;
	}
	
	@GetMapping("/orders{id}")
	EntityModel<Order> one(@PathVariable Long id) {
		return null;
	}
	
	@PostMapping("/orders")
	ResponseEntity<EntityModel<Order>> newOrder(@RequestBody Order order) {
		return null;
	}
	
}
