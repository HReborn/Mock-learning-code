package com.reborn.firstapi;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

public class EmployeeModelAssembler {
	// ao invés de retornar os dados puros, vamos retornar os links.
	// pra retornar os links, é necessário criar o entity model.
	
	public EntityModel<Employee> toModel(Employee employee) {
		return EntityModel.of(employee, 
				linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
				linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
				
	}
	
	public CollectionModel<EntityModel<Employee>> toCollectionModel(List<Employee> objEmployees) {
		List<EntityModel<Employee>> modelEmployees = objEmployees.stream()
				.map(employee -> EntityModel.of(employee,
						linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
						linkTo(methodOn(EmployeeController.class).all()).withRel("employees")
						)).collect(Collectors.toList());
		return CollectionModel.of(modelEmployees,
				linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
	}
}
