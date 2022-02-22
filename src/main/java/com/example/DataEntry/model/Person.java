package com.example.DataEntry.model;

import org.hibernate.envers.Audited;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Audited
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntityUUID<String>{

	private static final long serialVersionUID = 5525506574863105203L;
	
	private String firstname;
	
	private String lastname;
	
	private Position position;

}
