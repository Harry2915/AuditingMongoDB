package com.example.DataEntry.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.DataEntry.model.Person;

public interface PersonRepo extends MongoRepository<Person, UUID>{

}
