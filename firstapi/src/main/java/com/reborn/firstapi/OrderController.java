package com.reborn.firstapi;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
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
		List<EntityModel<Order>> orders = orderRepo.findAll().stream()
				.map(order -> EntityModel.of(order,
						linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
						linkTo(methodOn(OrderController.class).all()).withRel("orders")))
				.collect(Collectors.toList());
		
		return CollectionModel.of(null);
	}
	
	@GetMapping("/orders{id}")
	EntityModel<Order> one(@PathVariable Long id) {
		Order order = orderRepo.findById(id)
				.orElseThrow(() -> new OrderNotFoundException(id));
		
		return EntityModel.of(order, 
				linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
				linkTo(methodOn(OrderController.class).all()).withRel("employees"));	
	}
	
	@PostMapping("/orders")
	ResponseEntity<EntityModel<Order>> newOrder(@RequestBody Order order) {
		EntityModel<Order> entityModel = EntityModel.of(orderRepo.save(order),
				linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
				linkTo(methodOn(OrderController.class).all()).withRel("orders"));
		return ResponseEntity
				.created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
				.body(entityModel);
	}
	
}
