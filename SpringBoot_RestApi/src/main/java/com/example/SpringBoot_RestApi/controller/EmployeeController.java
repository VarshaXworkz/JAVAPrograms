package com.example.SpringBoot_RestApi.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_RestApi.entity.Employee;
import com.example.SpringBoot_RestApi.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")//static url cannot be changed
                                   //url within {} means it is dynamic
public class EmployeeController {
	@Autowired
	//Field injection
	EmployeeService service;
	
	@GetMapping
	public List<Employee> getEmployeeDetails(){
		return service.getDetails();
	}
	@PostMapping
	//->Constructor injection
	public Employee createEmployeeDetails(@RequestBody Employee emp ){
		return service.createEmployee(emp);	
}
	@GetMapping("/{empId}")
    public Optional<Employee> getEmployeeDetailsById(@PathVariable("empId") long id){
    return service.getDetailsById(id);
	}
	
	@DeleteMapping("/{empid}")
    public void  deleteEmployeeById(@PathVariable("empid") long id) {
    service.deleteDetailsById(id);
}

	}