package com.bhaiti.kela.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.Employee;
import com.bhaiti.kela.beans.EmployeeRegistration;

@Controller
public class UpdateController {
	
@RequestMapping(method = RequestMethod.PUT, value="/update/employee")

	
	@ResponseBody
	public String updateStudentRecord(@RequestBody Employee stdn) {		
		System.out.println("In updateStudentRecord");	   
	    return EmployeeRegistration.getInstance().upDateStudent(stdn);		
	}	

}
