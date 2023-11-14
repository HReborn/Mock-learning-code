package com.reborn.firstapi;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModelAssembler {
	// ao invés de retornar os dados puros, vamos retornar os links.
	// pra retornar os links, é necessário criar o entity model.
	
	public EntityModel<Employee> toModel(Employee employee) {
		return EntityModel.of(employee, 
				linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
				linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
				
	}
}
