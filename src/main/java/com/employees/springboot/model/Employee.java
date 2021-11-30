package com.employees.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="employees")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name")
    private String name;
  
	@Column(name = "age")
	private int age;
	
	@Column(name = "email")
    private String email;
    
	public Long getId() {
	return id;
    }

	public void setId(Long id) {
	this.id = id;
    }
    
	public String getName() {
	return name;
    }
    
	public void setName(String name) {
	this.name = name;
    }
    
	public int getAge() {
	return age;
    }

	public void setAge(int age) {
	this.age = age;
    }

	public String getEmail() {
	return email;
    }
   
	public void setEmail(String email) {
	this.email = email;
    }
}
