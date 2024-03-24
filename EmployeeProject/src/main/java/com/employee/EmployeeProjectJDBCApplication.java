package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepository;

@SpringBootApplication
public class EmployeeProjectJDBCApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EmployeeProjectJDBCApplication.class, args);
		Employee emp = context.getBean(Employee.class);
		emp.setId(201);
		emp.setName("Ramesh");
		emp.setDesignation("SDE-1");

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());

//		Employee emp2 = context.getBean(Employee.class);
//		System.out.println(emp2.getId());
//		System.out.println(emp2.getName());
//		System.out.println(emp2.getDesignation());

		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
		empRepo.save(emp);
		for (Employee employee : empRepo.getAll()) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getDesignation());

		}

	}
}
