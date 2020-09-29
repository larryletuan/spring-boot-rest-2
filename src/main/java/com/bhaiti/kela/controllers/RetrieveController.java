package com.bhaiti.kela.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.Employee;
import com.bhaiti.kela.beans.EmployeeRegistration;

@Controller
public class RetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/allemployee")

	@ResponseBody
	public List<Employee> getStudent() {
		return EmployeeRegistration.getInstance().getStudentRecords();
	}

}
