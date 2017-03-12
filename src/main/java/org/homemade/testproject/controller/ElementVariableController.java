package org.homemade.testproject.controller;

import org.homemade.testproject.entites.product.ElementVariable;
import org.homemade.testproject.repository.ElementVariableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller(value = "element-variable")
public class ElementVariableController {

	@Autowired
	private ElementVariableRepository repository;

	@GetMapping
	public ResponseEntity<ElementVariable> get(@RequestParam long id) {
		return ResponseEntity.ok(repository.findOne(id));
	}

	@PostMapping
	public ResponseEntity<ElementVariable> save(final ElementVariable variable) {
		return ResponseEntity.ok(repository.save(variable));

	}
}
