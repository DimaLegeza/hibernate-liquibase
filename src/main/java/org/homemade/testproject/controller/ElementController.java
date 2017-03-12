package org.homemade.testproject.controller;

import org.homemade.testproject.model.dto.ElementWithAttrs;
import org.homemade.testproject.model.entites.product.Element;
import org.homemade.testproject.repository.ElementRepository;
import org.homemade.testproject.service.ElementWithArgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "element")
public class ElementController {

	@Autowired
	private ElementRepository repository;

	@Autowired
	private ElementWithArgsService elementWithArgsService;

	@GetMapping
	public ResponseEntity<Element> get(@RequestParam long id) {
		return ResponseEntity.ok(repository.findOne(id));
	}

	@PostMapping
	public ResponseEntity<Element> save(@RequestBody final ElementWithAttrs variable) {
		return ResponseEntity.ok(elementWithArgsService.persist(variable));
	}
}
