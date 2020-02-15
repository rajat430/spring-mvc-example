package com.journaldev.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.journaldev.spring.model.Employee;

@Controller
public class EmpService {

	@ResponseBody
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public List<Employee> getAllEmp()
	{
		Employee e1=new Employee("rajat",101);
		Employee e2=new Employee("lakhan",102);
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		System.out.println("hello");
		return al;
	}
	
	
}
