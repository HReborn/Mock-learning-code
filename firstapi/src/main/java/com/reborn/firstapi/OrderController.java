package com.reborn.firstapi;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mediatype.problem.Problem;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
				.map(orderAssembler::toModel)
				.collect(Collectors.toList());
		
		return CollectionModel.of(orders, 
				linkTo(methodOn(OrderController.class).all()).withSelfRel());
	}
	
	@GetMapping("/orders/{id}")
	EntityModel<Order> one(@PathVariable Long id) {
		Order order = orderRepo.findById(id)
				.orElseThrow(() -> new OrderNotFoundException(id));
		
		return orderAssembler.toModel(order);	
	}
	
	@PostMapping("/orders")
	ResponseEntity<EntityModel<Order>> newOrder(@RequestBody Order order) {
		EntityModel<Order> entityModel = orderAssembler.toModel(orderRepo.save(order));
		return ResponseEntity
				.created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
				.body(entityModel);
	}
	
	@DeleteMapping("/orders/{id}/cancel")
	ResponseEntity<?> cancel(@PathVariable Long id) {
		Order order = orderRepo.findById(id)
				.orElseThrow(() -> new OrderNotFoundException(id));
		if (order.getStatus() == Status.IN_PROGRESS) {
			order.setStatus(Status.CANCELLED);
			return ResponseEntity.ok(orderAssembler.toModel(orderRepo.save(order)));
		}
		return ResponseEntity
				.status(HttpStatus.METHOD_NOT_ALLOWED)
				.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
				.body(Problem.create()
						.withTitle("Method not allowed")
						.withDetail("You can't cancel an order that is in the " + order.getStatus() + " status"));
	}
	
	@PutMapping("/orders/{id}/complete")
	ResponseEntity<?> complete(@PathVariable Long id) {
		Order order = orderRepo.findById(id)
				.orElseThrow(() -> new OrderNotFoundException(id));
		if (order.getStatus() == Status.IN_PROGRESS) {
			order.setStatus(Status.COMPLETED);
			return ResponseEntity.ok(orderAssembler.toModel(orderRepo.save(order)));
		}
		return ResponseEntity
				.status(HttpStatus.METHOD_NOT_ALLOWED)
				.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
				.body(Problem.create()
						.withTitle("Method not allowed")
						.withDetail("You can't complete an order that is in the " + order.getStatus() + " status"));
	}
	
}
