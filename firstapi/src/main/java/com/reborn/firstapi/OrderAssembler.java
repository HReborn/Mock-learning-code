package com.reborn.firstapi;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Component;

@Component
public class OrderAssembler {
	
	EntityModel<Order> toModel (Order order) {
		EntityModel<Order> orderEntity =  EntityModel.of(order, 
				linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
				linkTo(methodOn(OrderController.class).all()).withRel("orders"));
		
		if (order.getStatus() == Status.IN_PROGRESS) {
			orderEntity.add(linkTo(methodOn(OrderController.class).cancel(order.getId())).withRel("cancel"));
			orderEntity.add(linkTo(methodOn(OrderController.class).complete(order.getId())).withRel("complete"));
		}
		
		return orderEntity;
	}
}
