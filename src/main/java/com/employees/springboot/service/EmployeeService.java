package com.employees.springboot.service;

import java.util.List;

import com.employees.springboot.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
