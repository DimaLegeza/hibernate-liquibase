package org.homemade.testproject.controller;

import org.homemade.testproject.entites.product.Element;
import org.homemade.testproject.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "element")
public class ElementController {

	@Autowired
	private ElementRepository repository;

	@GetMapping
	public ResponseEntity<Element> get(@RequestParam long id) {
		return ResponseEntity.ok(repository.findOne(id));
	}

	@PostMapping
	public ResponseEntity<Element> save(final Element variable) {
		return ResponseEntity.ok(repository.save(variable));
	}
}
