package com.example.SpringBoot_RestApi.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.SpringBoot_RestApi.entity.Employee;
import com.example.SpringBoot_RestApi.repository.IEmployee;

@Service
public class EmployeeService{
	@Autowired
	IEmployee empRepo;
	
	public List<Employee> getDetails(){
		return empRepo.findAll();	}

	public Employee createEmployee(Employee emp) {
		return empRepo.save(emp);
	}
    public Optional<Employee> getDetailsById(long id) {
		return empRepo.findById(id);
	}
	public void deleteDetailsById(long id) {
		 empRepo.deleteById(id);
		
	}

	


}
