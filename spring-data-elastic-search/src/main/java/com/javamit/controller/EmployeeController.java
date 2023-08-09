package com.javamit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javamit.model.Employee;
import com.javamit.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public int addEmployee(@RequestBody List<Employee> employees){
         return employeeService.addNewEmployees(employees);
    }
    
    @PostMapping("/save")
    public Employee insertEmployee(@RequestBody Employee employee){
        return employeeService.insertNewEmployee(employee);
    }
    @GetMapping("/all")
    public Iterable<Employee> findAll(){
        return employeeService.getAll();
    }
    
    @GetMapping("/search/{id}")
    public Employee findEmployee(@PathVariable Integer id){
        return employeeService.findEmployee(id);
    }
    
    @GetMapping("/find/{firstName}")
    public List<Employee> findByFirstName(@PathVariable String firstName){
    	return employeeService.findByFirstName(firstName);
    }

    @DeleteMapping("/delete/{id}")
    public void removeEmployee(@PathVariable Integer id){
       employeeService.deleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public Employee update(@PathVariable Integer id, @RequestBody Employee employee){
        return  employeeService.upadateEmployee(id,employee);
    }
}
