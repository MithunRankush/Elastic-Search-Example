package com.javamit.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javamit.model.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee,Integer> {

	List<Employee> findByFirstName(String firstName);

}
