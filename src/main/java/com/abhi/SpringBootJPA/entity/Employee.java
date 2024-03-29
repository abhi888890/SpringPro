package com.abhi.SpringBootJPA.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int roll ;
	private String name ;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + "]";
	}
	public Employee() {
		super();
	}
	public Employee(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	
	
}
