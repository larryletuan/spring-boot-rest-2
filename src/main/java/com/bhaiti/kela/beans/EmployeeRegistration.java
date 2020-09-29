package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistration {
	
	private List<Employee> studentRecords;
	
	private static EmployeeRegistration stdregd = null;
	
	private EmployeeRegistration(){
		studentRecords = new ArrayList<Employee>();
	}
	
	public static EmployeeRegistration getInstance() {
		
		if(stdregd == null) {
			stdregd = new EmployeeRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}
	
	public void add(Employee std) {
		studentRecords.add(std);
	}
	
	public String upDateStudent(Employee std) {
		
		for(int i=0; i<studentRecords.size(); i++)
        {
            Employee stdn = studentRecords.get(i);
            System.out.println(stdn.getRegistrationNumber());
            System.out.println(std.getRegistrationNumber());
            if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
            	studentRecords.set(i, std);//update the new record
            	return "Update successful";
            }
        }
		
		return "Update un-successful";
		
	}
	
	public String deleteStudent(String registrationNumber) {
		
		for(int i=0; i<studentRecords.size(); i++)
        {
            Employee stdn = studentRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)) {
            	studentRecords.remove(i);//update the new record
            	return "Delete successful";
            }
        }
		
		return "Delete un-successful";
		
	}

	public List<Employee> getStudentRecords() {
		return studentRecords;
	}

}
