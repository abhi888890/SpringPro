package com.abhi.SpringBootJPA.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.SpringBootJPA.Service.EmployeeService;
import com.abhi.SpringBootJPA.entity.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class EmployeeController {

	private EmployeeService ES;

	@Autowired
	public EmployeeController(EmployeeService ES) {
		super();
		this.ES = ES;
	}

	@GetMapping("/getEmp")
	@ResponseBody
	public ResponseEntity<ArrayList<Employee>> getAllEmp() {
		
		
	    ArrayList<Employee> empList = ES.getAllEmp();

	    if (empList != null && !empList.isEmpty()) {
	        return ResponseEntity.ok(empList);
	    } else {
	        return ResponseEntity.status(404).build() ;
	    }
	}
	
	public EmployeeController() {
		super();
	}

	@PostMapping("/addEmp")
	public ResponseEntity<String> addEmp(@RequestBody Employee e) {
	
		ES.addEmp(e);
		return ResponseEntity.status(HttpStatus.CREATED).body("created succ !");
	}
	
}
