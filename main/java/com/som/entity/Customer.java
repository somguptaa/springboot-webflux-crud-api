package com.som.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Document(collection = "customer_records")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private long contactId;

}
