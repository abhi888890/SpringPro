package com.abhi.SpringBootJPA.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhi.SpringBootJPA.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer >{

}
