package com.example.demo.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor


public class Employeedto {

	//@Column(name = "name")
	private String name;
	
	//@Column(name = "department_name")
	private String departmentName;
}
