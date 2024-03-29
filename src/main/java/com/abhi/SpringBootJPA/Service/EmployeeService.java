package com.abhi.SpringBootJPA.Service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhi.SpringBootJPA.Dao.EmployeeRepo;
import com.abhi.SpringBootJPA.entity.Employee;
public class EmployeeService {

	private EmployeeRepo ER ;
	
	public EmployeeService(EmployeeRepo ER) {
		super();
		this.ER = ER;
	}
	
	public ArrayList<Employee> getAllEmp()
	{
		ArrayList<Employee> lst=(ArrayList<Employee>) ER.findAll();
		return lst;
	}

	public void addEmp(Employee e)
	{
		ER.save(e);
	}
}
