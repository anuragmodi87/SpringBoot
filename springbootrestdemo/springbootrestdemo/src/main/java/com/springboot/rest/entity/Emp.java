package com.springboot.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	
@Entity
@Table(name = "EMP", schema= "TEST_SCHEMA")
public class Emp {

    
    @Id	
    @Column
    private Long id;
    @Column
    private String emp_name;
    @Column
    private String emp_dept;

  
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + "]";
	}
}
