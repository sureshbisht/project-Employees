package com.gl.employeesvc.EmployeesSvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.gl.employeesvc.EmployeesSvc"})
public class EmployeesSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesSvcApplication.class, args);
	}

}
