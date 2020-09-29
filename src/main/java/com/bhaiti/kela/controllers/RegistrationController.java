package com.bhaiti.kela.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.*;

@Controller
public class RegistrationController {
	
	@RequestMapping(method = RequestMethod.POST, value="/register/employee")

	
	@ResponseBody
	RegistrationReply registerStudent(@RequestBody Employee employee) {
		
		System.out.println("In registerStudent");
        RegistrationReply stdregreply = new RegistrationReply();           

        EmployeeRegistration.getInstance().add(employee);

        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(employee.getName());
        stdregreply.setAge(employee.getAge());
        stdregreply.setRegistrationNumber(employee.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");


        return stdregreply;
        
	}

}
