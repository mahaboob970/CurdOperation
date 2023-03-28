package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "salary")
	private float salary;

//	@Override
//	public String toString() {
//		return "Users [userId=" + userId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
//	}
//
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public Float getSalary() {
//		return salary;
//	}
//
//	public void setSalary(Float salary) {
//		this.salary = salary;
//	}
//
//	@Column(name="salary")
//	private Float salary;
//
//	public Users() {
//		super();
//	}
//
//	public Users(int userId, String name, int age, Float salary) {
//		super();
//		this.userId = userId;
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//	}
//	

}
