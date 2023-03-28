package com.example.demo.Controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserServices;
import com.example.demo.dto.Employeedto;
import com.example.demo.entity.Users;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices userServices;

	@GetMapping("/allUsers")
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> users = null;
		try {
			users = userServices.getAllUsers();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable("id") int userId) {
		Users users = null;
		try {
			users = userServices.getUserById(userId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

	@PostMapping("/addorupdate")
	public ResponseEntity<Users> addOrUpdateUser(@RequestBody Users user) {
		Users users = null;
		try {
			users = userServices.addOrUpdateUser(user);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Users> deleteUser(@PathVariable("id") int userId) {
		Users users = null;
		try {
			users = userServices.deleteUser(userId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

	@GetMapping("/allUserBySalary/{salary}")
	public ResponseEntity<List<Users>> getAllUserBySalary(@PathVariable("salary") float salary) {
		List<Users> users = null;
		try {
			users = userServices.getUserBySalary(salary);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/allNameAndDepartmentName")
	public ResponseEntity<List<Employeedto>> findAllNameAndDepartment(@PathVariable("department_id") int department_id) {
		List<Employeedto> employeedto = null;
		try {
			employeedto = userServices.findAllNameAndDepartment(department_id);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Employeedto>>(employeedto, HttpStatus.OK);
	}
}
