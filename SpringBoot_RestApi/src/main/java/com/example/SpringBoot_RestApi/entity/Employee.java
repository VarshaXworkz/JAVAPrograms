package com.example.SpringBoot_RestApi.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employeeId;
	private String employeeName;
	private String employeeState;
	

}
