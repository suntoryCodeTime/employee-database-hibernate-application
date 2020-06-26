package com.suntorycodetime.services.employee.resource;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suntorycodetime.services.business.BusinessService;
import com.suntorycodetime.services.employee.config.EmployeeServiceConfig;
import com.suntorycodetime.services.employee.data.entity.Employee;
import com.suntorycodetime.services.employee.data.entity.EmployeeBuilder;

public class EmployeeDatabaseApplicationResource {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeServiceConfig.class);
		
		//Get the bean from spring container
		BusinessService businessService = context.getBean("businessService", BusinessService.class);
		
		//Call method on the bean
		businessService.addEmployee(new Employee("Bruce", "Wayne", "Wayne Corp."));
		businessService.addEmployee(new Employee("Jeff", "Bezos", "Amazon"));
		businessService.addEmployee(new Employee("Elon", "Musk", "Tesla"));
		businessService.addEmployee(new Employee("Grimes", "Musk", "Tesla"));
		businessService.getEmployee(2);
		businessService.deleteEmployee(2);
		businessService.getEmployees("Tesla");
		
	 
		
		//Close context
		context.close();
	}

}
