package com.example.DataEntry.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DataEntry.model.Person;
import com.example.DataEntry.repository.PersonRepo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonService {

	@Autowired
	private  PersonRepo personRepo;

	public Person save(Person person) {
		if (person.getId() == null) {
			person.setId(UUID.randomUUID());
		}
		return personRepo.save(person);
	}

	public void removeAll(List<UUID> ids) {
		ids.forEach(personRepo::deleteById);
	}

	public Optional<Person> get(UUID uuid) {
		return personRepo.findById(uuid);
	}

	public List<Person> list() {
		return personRepo.findAll();
	}
}
