package com.springboot.rest.entity;

import java.util.ArrayList;
import java.util.List;

public class Employees 
{
    private List<Emp> employeeList;
    
    public List<Emp> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
 
    public void setEmployeeList(List<Emp> employeeList) {
        this.employeeList = employeeList;
    }
}
