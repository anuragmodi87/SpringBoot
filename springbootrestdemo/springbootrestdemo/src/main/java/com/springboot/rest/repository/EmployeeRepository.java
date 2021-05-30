package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.entity.Emp;
import com.springboot.rest.entity.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Emp, Long>
{

}
