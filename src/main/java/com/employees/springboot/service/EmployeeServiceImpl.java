package com.employees.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employees.springboot.repository.EmployeeRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

import com.employees.springboot.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	@Override
    public Employee getEmployeeById(long id)
    {
		java.util.Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee =null;
		if(optional.isPresent())
		{
			employee = optional.get();
		}
		else
		{
			throw new RuntimeException("Employe not found for id:"+id);
		}
		
		return employee;
    }
    @Override
    public void deleteEmployeeById(long id) {
    	employeeRepository.deleteById(id);
    }
}
