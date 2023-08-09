package com.javamit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamit.model.Employee;
import com.javamit.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	public int addNewEmployees(List<Employee> employees) {
		employeeRepository.saveAll(employees);
		return employees.size();
	}

    public Iterable<Employee> getAll() {
        return employeeRepository.findAll();
    }
    
    public Employee findEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee upadateEmployee(Integer id, Employee employee){
        Employee emp = employeeRepository.findById(id).get();
        emp.setAge(employee.getAge());
       return employeeRepository.save(emp);
    }

	public List<Employee> findByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

	public Employee insertNewEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	


}
