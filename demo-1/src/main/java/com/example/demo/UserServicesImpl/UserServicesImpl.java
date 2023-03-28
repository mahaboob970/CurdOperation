package com.example.demo.UserServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmpolyeeData;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserServices;
import com.example.demo.dto.Employeedto;
import com.example.demo.entity.Users;

@Service
public class UserServicesImpl implements UserServices {


	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EmpolyeeData empolyeeData;

	@Override
	public List<Users> getAllUsers() {

		return (List<Users>) userRepository.findAll();
	}

	@Override
	public Users getUserById(int userId) {
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public Users addOrUpdateUser(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Users deleteUser(int userId) throws Exception {
		Users deletedUsers = null;
		try {
			deletedUsers = userRepository.findById(userId).orElse(null);
			if (deletedUsers == null) {
				throw new Exception("user not available");
			} else {
				userRepository.deleteById(userId);
			}
		} catch (Exception ex) {

		}
		return deletedUsers;
	}

	@Override
	public List<Users> getUserBySalary(float salary) {
		return userRepository.findAllBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employeedto> findAllNameAndDepartment(int department_id) {
		return empolyeeData.findAllNameAndDepartment(department_id);
	}

}
