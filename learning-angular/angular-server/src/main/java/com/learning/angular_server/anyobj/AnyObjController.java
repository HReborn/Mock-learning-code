package com.learning.angular_server.anyobj;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AnyObjController {
	private final AnyObjRepository repo;

	public AnyObjController(AnyObjRepository repo) {
		super();
		this.repo = repo;
	}
	
	@GetMapping("/objs")
	List<AnyObj> all() {
		return repo.findAll();
	}
	
	@GetMapping("/objs/{id}")
	AnyObj one(@PathVariable Long id) {
		return repo.findById(id).orElseThrow(() -> new AnyObjNotFoundException(id));
	}
}