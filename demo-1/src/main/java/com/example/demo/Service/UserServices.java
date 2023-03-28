package com.example.demo.Service;

import java.util.List;

import com.example.demo.dto.Employeedto;
import com.example.demo.entity.Users;

public interface UserServices {

	public List<Users> getAllUsers();

	public Users getUserById(int userId);

	public Users addOrUpdateUser(Users user);

	public Users deleteUser(int userId) throws Exception;

	public List<Users> getUserBySalary(float salary);
	
	public List<Employeedto> findAllNameAndDepartment(int department_id);
	
}
