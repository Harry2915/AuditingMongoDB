package com.example.DataEntry.Controller;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DataEntry.model.Person;
import com.example.DataEntry.service.impl.PersonService;


@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("{id}")
	public ResponseEntity<Person> get(@PathVariable UUID id) {
		return personService.get(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping
	public List<Person> list() {
		return personService.list();
	}

	@PostMapping
	public Person save(@RequestBody Person person) {
		
		return personService.save(person);
	}

	@PutMapping("{id}")
	public Person edit(@PathVariable UUID id, @RequestBody Person person) {
		person.setId(id);
		return personService.save(person);
	}

	@PostMapping("/delete")
	public void remove(@RequestBody List<UUID> ids) {
		personService.removeAll(ids);
	}
	
	

}
