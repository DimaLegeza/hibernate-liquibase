package org.homemade.testproject.controller;

import org.homemade.testproject.model.dto.Attr;
import org.homemade.testproject.model.entites.product.ElementVariable;
import org.homemade.testproject.repository.ElementVariableRepository;
import org.homemade.testproject.service.ElementWithArgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "element-variable")
public class ElementVariableController {

	@Autowired
	private ElementVariableRepository repository;

	@Autowired
	private ElementWithArgsService elementWithArgsService;

	@GetMapping
	public ResponseEntity<ElementVariable> get(@RequestParam long id) {
		return ResponseEntity.ok(repository.findOne(id));
	}

	@PutMapping
	public ResponseEntity<ElementVariable> append(@RequestBody Attr attr) {
		return ResponseEntity.ok(elementWithArgsService.persist(attr));
	}

}
