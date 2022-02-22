package com.example.AuditingExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class DataEntryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataEntryApplication.class, args);
	}

}
