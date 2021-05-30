package com.springboot.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entity.Emp;
import com.springboot.rest.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;

	// Insert user record
	@PostMapping(value = "/add")
	public String addEmployee(@RequestBody Emp user) {
		System.out.println("Inside Add");
		empRepo.save(user);
		System.out.println("After Save data:::");
		return "200";
	}

	// Fetch all user records
	@GetMapping(value = "/getAll")
	public List<Emp> getAllUsers() {
		System.out.println("Inside getAll");
		return empRepo.findAll();
	}

	// Fetch single user
	@GetMapping("/get/{id}")
	public Emp getUserById(@PathVariable("id") Long userId) {
		System.out.println("Inside get employee");
		Optional<Emp> optional = empRepo.findById(userId);
		if (optional.isPresent()) {
			System.out.println("***********Data isPresent If:***********");
		} else {
			System.out.println("***********Data isPresent Else:***********");
		}
		return optional.get();
	}

	// Update user record
	@PutMapping("/updateuser")
	public Emp updateUser(@RequestBody Emp emp) {
		System.out.println("Inside update user");
		return empRepo.save(emp);

	}

	// Delete user record
	@DeleteMapping("/delete")
	public String deleteUser(@RequestBody Emp emp) {
		System.out.println("Inside delete");
		empRepo.delete(emp);
		return HttpStatus.OK.name();
	}
}