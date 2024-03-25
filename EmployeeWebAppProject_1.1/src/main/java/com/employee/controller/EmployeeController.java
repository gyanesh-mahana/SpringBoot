package com.employee.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.dao.EmployeeRepo;
import com.employee.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		System.out.println(employee.toString());
//		return "display.jsp";
		return "home.jsp";
	}

	@RequestMapping("/fetchEmployees")
	public String fetchEmployees(Model model) {
		List<Employee> listEmplyee = (List<Employee>) repo.findAll();
		model.addAttribute("employeeList", listEmplyee);
		return "employeesData.jsp";
	}
	
	@RequestMapping("/fetchEmployee")
	public String fetchEmployee(HttpServletRequest req, Model model) {
		String empId = req.getParameter("empId");
		Optional<Employee> emp = repo.findById(Integer.valueOf(empId));
		model.addAttribute("emp", emp.get());
		return "employeeData.jsp";
	}
}
