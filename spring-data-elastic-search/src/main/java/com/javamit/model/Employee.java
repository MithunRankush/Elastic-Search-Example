package com.javamit.model;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "employee")
public class Employee {
	private int id;
    private String firstName;
    private String lastName;
    private int age;
}
