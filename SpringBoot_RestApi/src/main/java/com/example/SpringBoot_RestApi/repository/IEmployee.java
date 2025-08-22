package com.example.SpringBoot_RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_RestApi.entity.Employee;

@Repository
public interface IEmployee extends JpaRepository<Employee,Long>{

}
